import java.util.*;
/*Step-by-Step Logic
Sort jobs by profit (descending)

Find maximum deadline → number of days available

Create array slot[] → to track days

For each job:

Try to schedule it on latest free day ≤ deadline

If free → assign job

Else → skip*/
public class inclass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] id = new String[n];
        int[] deadline = new int[n];
        int[] profit = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            id[i] = sc.next();
            deadline[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }

        // Step 1: Sort by profit (descending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (profit[i] < profit[j]) {

                    // swap profit
                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    // swap deadline
                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;

                    // swap id
                    String t = id[i];
                    id[i] = id[j];
                    id[j] = t;
                }
            }
        }

        // Step 2: find max deadline
        int maxDeadline = 0;
        for (int d : deadline) {
            if (d > maxDeadline) {
                maxDeadline = d;
            }
        }

        // Step 3: slot array
        boolean[] slot = new boolean[maxDeadline + 1];

        int count = 0, totalProfit = 0;

        // Step 4: schedule jobs
        for (int i = 0; i < n; i++) {

            // try from deadline to 1
            for (int j = deadline[i]; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    count++;
                    totalProfit += profit[i];
                    break;
                }
            }
        }

        System.out.println(count + " " + totalProfit);
    }
}