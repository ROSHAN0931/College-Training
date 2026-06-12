/*
Automorphic Number

	n = 4 => sq = 16
	d = 1 => false

	n=5 => 25
	d=1 => true

	n=12 => 144
	d=2
	false

	n=11 => 121
	false

	n=25 => 625 => true

 */
import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;

        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = 1;
        for (int i = 0; i < digits; i++) {
            divisor *= 10;
        }

        if (square % divisor == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}