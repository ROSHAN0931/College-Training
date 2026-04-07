import java.util.*;

public class identifyCycle {

    static boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node, graph, visited)) {
                    return true;
                }
            } else if (nei != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        // Build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected
        }

        boolean[] visited = new boolean[V];
        boolean hasCycle = false;

        // Handle disconnected graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, graph, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Detected");
        }
    }
}