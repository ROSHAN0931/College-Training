/*
Perfect Number

	n = 28

	div = 1 2 4 7 14 => 28

	sum of div == n  => true

 */
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}