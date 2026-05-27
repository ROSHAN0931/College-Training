import java.util.Scanner;
public class l153findmininrotatedarray {
    public static int findMin(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            int mid = (left+right)/2;
            if (nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int res = findMin(arr);
        System.out.println(res);
    }
}
