/*
Fibonacci Series
	(index)n=6 => 0 1 1 2 3 5 8
 */
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 6
        int a = 0;//0
        int b = 1;//1
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            int c = a+b;//1
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
