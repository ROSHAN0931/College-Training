/*
Trailing zeros in factorial

	n = 5 => 5! => 120 => 1 =>find count of last zeros
	n = 10! => 3628800 => 2
	n = 100! => 24 zero in last
 */
import java.util.Scanner;

public class trailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }

        System.out.println(count);

        sc.close();
    }
}
