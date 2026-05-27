import java.util.Scanner;
public class l1390fourdivisors {
    public static int sumFourDivisors(int[] nums){
        int ans = 0;
        for (int n : nums) {
            int count = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    sum += i;
                }
                if (count > 4)
                    break;
            }
            if (count == 4)
                ans += sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int res = sumFourDivisors(arr);
        System.out.println(res);
    }
}
