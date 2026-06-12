/*
Prime numbers in given range

	start = 10 , end = 20

	Prime => 11 13 17 19 => count is 4
 */
import java.util.Scanner;
public class primenumberrange {
    static boolean prime(int val){
        if (val < 2){
            return false;
        }
        for (int i = 2; i * i <= val ; i++) {
            if (val%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i <= end ; i++) {
            if (prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
