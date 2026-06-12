/*
Friendly Pair

	n = 6 , m = 28

	div of n => 1 2 3 6 => 12 / n => 2
	div of m => 1 2 4 7 14 28 => 56 / m => 2
 */
import java.util.Scanner;

public class pair {

    static int sumOfDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum1 = sumOfDivisors(n);
        int sum2 = sumOfDivisors(m);

        if ((double) sum1 / n == (double) sum2 / m) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not a Friendly Pair");
        }

        sc.close();
    }
}
