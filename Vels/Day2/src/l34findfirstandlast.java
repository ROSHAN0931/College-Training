import java.util.Arrays;
import java.util.Scanner;

public class l34findfirstandlast {
    public static int[] searchRange(int[] nums,int target){
        int first = -1;
        int last = -1;

        int left = 0;
        int right = nums.length - 1;

        //first position
        while (left<=right){
            int mid = (left + right) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            if (nums[mid]==target) {
                first = mid;
            }
        }

        left = 0;
        right = nums.length-1;

        //second position
        while (left<=right){
            int mid = (left + right) / 2;
            if (nums[mid]< target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            if (nums[mid]==target) {
                last = mid;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int res[] = searchRange(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
