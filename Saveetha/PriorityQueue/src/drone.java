import java.util.*;

public class drone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Min Heap based on distance
        // Euclidean distance formula
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pq.add(new int[]{x, y});
        }

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int[] p = pq.poll();
            System.out.println(p[0] + " " + p[1]);
        }
    }
}