import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class leaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            pq.add(val);
        }
        int k = in.nextInt();
        int res = 0;
        for (int i = 0; i < k; i++) {
            if (i==k-1){
                res = pq.poll();
            }
            pq.poll();
        }
        System.out.println(res);
    }
}
