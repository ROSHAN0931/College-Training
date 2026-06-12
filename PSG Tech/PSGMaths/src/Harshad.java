/*
Harshad Number

	n = 18
	sum => 1 + 8 => 9
	check = 18 % sum == 0 > true
 */
import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (original % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
