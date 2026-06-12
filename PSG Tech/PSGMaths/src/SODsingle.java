/*
SOD until single digit

	4567 => 4+5+6+7 => 22 => 2+2 => 4

	n = 456 => 15 => 6
	456/9 => rerm => 6

	333/9 => if rem is 0 => then ot is 9 (compulsory)

	334/9 => 1
 */
import java.util.Scanner;
public class SODsingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%9==0){
            System.out.println(9);
        }
        else{
            System.out.println(n%9);
        }
    }
}
