/*
Reverse given number
	n=456 => 654
 */
import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0;
        while (n>0){
            rev = rev * 10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse : " + rev);
    }
}
