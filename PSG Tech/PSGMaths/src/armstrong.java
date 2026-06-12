/*
Armstrong Number

	n = 153 => NOD => 3
	cal = 1^3 + 5^3 + 3^3
	    = 1 + 125 + 27
	    = 153

	n == output => true

 */
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;

        // Find number of digits
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            nod++;
            temp /= 10;
        }

        // Calculate sum of digits raised to NOD
        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, nod);
            temp /= 10;
        }

        // Check Armstrong
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}