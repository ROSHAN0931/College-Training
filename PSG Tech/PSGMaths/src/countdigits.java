import java.util.Scanner;

/*
Count number of digits
	n=1278 => 4
 */
public class countdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n>0){
            count++;
            n = n/10;
        }
        System.out.println("Digit : " +count);
    }
}
