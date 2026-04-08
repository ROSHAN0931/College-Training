import java.util.Scanner;
public class GCD {
    public static int gcd(int a,int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int findGCD(int[] arr){
        int result = arr[0]; // 20
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result,arr[i]); // 20 1
            if (result == 1){
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];//20 1 60 80 100
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findGCD(arr));
    }
}
