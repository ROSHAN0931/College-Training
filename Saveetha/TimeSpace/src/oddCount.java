import java.util.Scanner;

public class oddCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int count = 0;
        for (int i = start ; i<= end;i++){
            if (i%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
