import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GB{
    int vertices;
    List<List<Integer>> adj;
    GB(int v){
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
    }
    public void bfs(int start){
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start); // 0
        System.out.println("BFS Traversal : ");
        while (!queue.isEmpty()){
            int val = queue.poll();
            System.out.print(val +" "); // 0
            for (int x : adj.get(val)){
                if (!visited[x]){
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
}
public class GraphBfs {
    public static void main(String[] args) {
        GB g = new GB(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.bfs(0);
    }
}
