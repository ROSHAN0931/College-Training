/*
LCM and GCD

   a=12
   b=18
	f of 12 = 12346
	f of 18 = 12369
	common = 1236 => 6 (gcd)

	lcm = a * b / gcd(a,b) => 12 * 18 / 6 => 36 (lcm)

 */
import java.util.Scanner;
public class lcmgcd {
    static int gcd(int a,int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcd(a,b);
        int lcm = (a*b) / gcd;
        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);
    }
}