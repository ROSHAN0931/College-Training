import java.util.*;
/*Store start & end in arrays

Sort activities based on end time

Pick first activity

For next activities:

If start >= lastEnd → take it*/ 
public class inclass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        // Sort based on end time (simple swap)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (end[i] > end[j]) {
                    // swap end
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;

                    // swap start accordingly
                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }

        // Pick first activity
        int count = 1;
        int lastEnd = end[0];

        // Check remaining
        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }

        System.out.println(count);
    }
}