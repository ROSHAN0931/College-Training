import java.util.ArrayList;
import java.util.List;

class GD{
    int vertices;
    List<List<Integer>> adj;
    GD(int v){
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
    }
    public void dfs(int start){
        boolean visited[] = new boolean[vertices];
        System.out.println("DFS Traversal : ");
        checkDepth(start,visited);
    }
    public void checkDepth(int val,boolean[] visited){
        visited[val] = true; // 0
        System.out.print(val + " ");
        for (int x : adj.get(val)){
            if(!visited[x]){
                checkDepth(x,visited);
            }
        }
    }
}

public class GraphDfs {
    public static void main(String[] args) {
        GD g = new GD(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.dfs(0);
    }
}
