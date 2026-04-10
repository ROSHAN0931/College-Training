public class firstEven {
    public static int findEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,4,7};
        System.out.println("First Even : " + findEven(arr));
    }
}
