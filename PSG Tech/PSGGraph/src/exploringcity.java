import java.util.*;

public class exploringcity {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph
            graph[u].add(v);
            graph[v].add(u);
        }

        int start = sc.nextInt();

        visited = new boolean[n + 1];
        dfs(start);

    }
}