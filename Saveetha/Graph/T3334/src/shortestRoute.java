import java.util.*;

public class shortestRoute {

    public static void bfs(int start, List<List<Integer>> graph, int n) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : graph.get(node)) {
                if (dist[nei] == -1) {
                    dist[nei] = dist[node] + 6;
                    q.add(nei);
                }
            }
        }

        // Print result (skip start node)
        for (int i = 1; i <= n; i++) {
            if (i != start) {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // number of queries

        while (q-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Build graph
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            // Read edges
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            int start = sc.nextInt();

            bfs(start, graph, n);
        }
    }
}