public class largestNumber {
    public static int findLarge(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,43,21};
        System.out.println("Largest Val : " + findLarge(arr));
    }
}
