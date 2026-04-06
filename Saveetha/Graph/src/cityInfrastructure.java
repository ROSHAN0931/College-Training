import java.util.*;

class GBFS{
    int vertices;
    List<List<Integer>> adj;
    GBFS(int v){
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
    public void bfs(int start){
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start); // 0
        while (!queue.isEmpty()){
            int val = queue.poll();
            System.out.print((val+1) +" "); // 0
            for (int x : adj.get(val)){
                if (!visited[x]){
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
}
public class cityInfrastructure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ver = in.nextInt();
        GBFS g = new GBFS(ver);
        int ed = in.nextInt();
        for (int i=0;i<ed;i++){
            int src = in.nextInt();
            int dest = in.nextInt();
            g.addEdge(src-1,dest-1);
        }
        int start = in.nextInt();
        g.bfs(start-1);
    }
}
