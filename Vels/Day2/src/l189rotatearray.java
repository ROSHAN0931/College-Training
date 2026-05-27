import java.util.ArrayList;
import java.util.Scanner;

public class l189rotatearray {
    public static void rotate(int[] nums,int k){
        int n = nums.length; // 5
        k = k % n; // 8 % 5 => 3
        // 1 2 3 4 5
        // 0 1 2 3 4
        ArrayList<Integer> list = new ArrayList<>(); // []
        for (int i=n-k;i<n;i++){
            list.add(nums[i]); // [3 4 5]
        }
        for (int i=0;i<n-k;i++){
            list.add(nums[i]);//[3 4 5 1 2]
        }
        for (int i=0;i<n;i++){
            nums[i] = list.get(i);
        }
        // 3 4 5 1 2
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // 1 2 3 4 5
        }
        int k = in.nextInt(); // 8
        rotate(arr,k); //
    }
}
