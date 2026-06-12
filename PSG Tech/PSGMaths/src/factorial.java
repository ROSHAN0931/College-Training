/*
Factorial
	5! = > 1x2x3x4x5 => 120
 */
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1;i<=n ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}
