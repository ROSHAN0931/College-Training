/*
Power of num (without using pow)

	n = 2 , m = 5
	cal = 2^5 => 32

 */
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= m; i++) {
            result *= n;
        }

        System.out.println(result);

        sc.close();
    }
}
