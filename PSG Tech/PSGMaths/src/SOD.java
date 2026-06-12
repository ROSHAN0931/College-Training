/*
Sum of digits
	4567 => 4+5+6+7 => 22
 */
import java.util.Scanner;
public class SOD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 123
        int sum = 0;
        while (n > 0){
            sum = sum + n%10; // 3
            n = n/10;
        }
        System.out.println("SOD : " + sum);
    }
}
