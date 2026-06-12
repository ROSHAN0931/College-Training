/*
Ugly Number

	Have to take only these three numbers => 2 3 5

	n = 16 => 2 x 2 x 2 x 2  => 16 => ugly
	n = 14 => not ugly
	n = 45 => 3 x 5 x 3 => ugly
	n = 26 => not ugly

 */
import java.util.Scanner;

public class ugly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not an Ugly Number");
            return;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an Ugly Number");
        }

        sc.close();
    }
}
