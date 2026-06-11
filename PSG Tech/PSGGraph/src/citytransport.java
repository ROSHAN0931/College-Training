import java.util.Scanner;

public class citytransport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of cities (nodes)
        int m = sc.nextInt(); // Number of routes (edges)

        int[][] adjMatrix = new int[n][n];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjMatrix[u - 1][v - 1] = 1; // Directed edge
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}