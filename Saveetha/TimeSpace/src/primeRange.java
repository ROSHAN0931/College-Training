import java.util.Scanner;
public class primeRange {
    // sqrt(n)
    public static boolean Prime(int val){
        for (int i=2;i*i<=val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
    public static void checkPrime(int start, int end){
        for (int i=start;i<=end;i++){
            if (Prime(i)){
                System.out.print(i + " "); // 11
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        checkPrime(start,end);
    }
}
