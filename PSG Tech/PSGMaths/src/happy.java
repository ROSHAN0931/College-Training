/*
Happy Number

	n = 19

	1^2 + 9^2 => 1+81 => 82
	8^2 + 2^2 => 64+4 => 68
	6^2 + 8^2 => 36+64 => 100
	1^2 + 0^2 + 0^2 => 1 => stop => true

	n = 4 => false (base condition)
 */
import java.util.Scanner;

public class happy {

    static int squareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 1 && n != 4) {
            n = squareSum(n);
        }

        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }

        sc.close();
    }
}
