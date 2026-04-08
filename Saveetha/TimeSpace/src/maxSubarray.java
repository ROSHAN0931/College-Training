public class maxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = Integer.MIN_VALUE;
        // Normal - Time - o(n*n) , Space - O(1)
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                sum = sum + arr[j];
                maxsum = Math.max(maxsum,sum);
            }
        }
        System.out.println(maxsum);
        // Optimised - Time - O(n),Space - O(1)
        int currentsum = arr[0];//-2
        int maxSum = arr[0];//-2
        for (int i = 1; i < arr.length; i++) {
            currentsum = Math.max(arr[i],currentsum+arr[i]); // -2
            maxSum = Math.max(maxSum,currentsum);// 1
        }
        System.out.println(maxSum);
    }
}
