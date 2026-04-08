import java.util.Scanner;

public class trailingZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 5
        int count = 0;
        for (int i=5;i<=n;i=i*5){
            count += n/i;//1
        }
        System.out.println(count);
    }
}
