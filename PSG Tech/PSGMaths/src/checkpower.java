/*
Power of 2

	n = 16
	whether this n will the power of 2 => 2^4 => true

 */
import java.util.Scanner;

public class checkpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("False");
            return;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        if (n == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
