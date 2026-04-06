import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GDFS{
    int vertices;
    List<List<Integer>> adj;
    GDFS(int v){
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void dfs(int start){
        boolean visited[] = new boolean[vertices];
        System.out.println("DFS Traversal : ");
        checkDepth(start,visited);
    }
    public void checkDepth(int val,boolean[] visited){
        visited[val] = true; // 0
        System.out.print((val+1) + " ");
        for (int x : adj.get(val)){
            if(!visited[x]){
                checkDepth(x,visited);
            }
        }
    }
}

public class exploringCity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ver = in.nextInt();
        GDFS g = new GDFS(ver);
        int ed = in.nextInt();
        for (int i=0;i<ed;i++){
            int src = in.nextInt();
            int dest = in.nextInt();
            g.addEdge(src-1,dest-1);
        }
        int start = in.nextInt();
        g.dfs(start-1);
    }
}
