import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class choclates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            pq.add(val);
        }
        // 25 64 9 4 100
        //100 64 25 9 4
        int k = in.nextInt(); // 4
        for (int i = 0; i < k; i++) {
            int max = pq.poll();
            int reduce = (int)Math.floor(Math.sqrt(max)); // 10
            pq.add(reduce);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + pq.poll();
        }
        System.out.println(sum);
    }
}
