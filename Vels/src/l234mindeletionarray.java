import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class l234mindeletionarray {
    public static int minOperations(int[] nums,int[] numsdiv){
        int a = numsdiv[0];
        for (int i = 1; i < numsdiv.length; i++) {
            a = GCD(a,numsdiv[i]);
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (a%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static int GCD(int a,int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        int numsdiv[] = new int[n];
        for (int i = 0; i < n; i++) {
            numsdiv[i] = in.nextInt();
        }
        int res = minOperations(nums,numsdiv);
        System.out.println(res);
    }
}
