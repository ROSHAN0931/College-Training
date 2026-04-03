import java.util.*;

public class closeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int k = sc.nextInt();

        // Min Heap: sort by distance, then value
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[1] == b[1]) {
                        return a[0] - b[0]; // smaller value first
                    }
                    return a[1] - b[1]; // smaller distance first
                }
        );

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) continue;

            int dist = Math.abs(arr[i] - x);
            pq.add(new int[]{arr[i], dist});
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(pq.poll()[0]);
        }

        // Sort final answer (IMPORTANT)
        Collections.sort(result);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}