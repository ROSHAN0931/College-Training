/*
Palindrome
	n=121=>rev(121)=> true
	n=124=>rev(421)=> false
 */
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = n;
        int rev = 0;
        while (n>0){
            rev = rev * 10 + n%10;
            n = n/10;
        }
        if (rev==t){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
