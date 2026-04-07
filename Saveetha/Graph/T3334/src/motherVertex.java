import java.util.*;

public class motherVertex {

    static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(nei, graph, visited);
            }
        }
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

        // Read edges (directed)
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        int candidate = -1;

        // Step 1: Find candidate
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                candidate = i;
            }
        }

        // Step 2: Verify candidate
        Arrays.fill(visited, false);
        dfs(candidate, graph, visited);

        // Check if all visited
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(candidate);
    }
}