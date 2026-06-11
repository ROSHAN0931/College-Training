import java.util.ArrayList;

public class dfs {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void graphdfs(int node,boolean[] visited){
        visited[node] = true;
        System.out.print(node + " "); // 0 1 3 2 4
        for(int nearby : adj.get(node)){
            if (!visited[nearby]){
                graphdfs(nearby,visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        boolean[] visited = new boolean[vertices];
        graphdfs(0,visited);
    }
}
