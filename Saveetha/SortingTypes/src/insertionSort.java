public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,8,4,2};
        for (int i = 1; i < arr.length; i++) {
            int insert = arr[i]; //current ele
            int j = i-1; // prev ele

            while (j>=0 && arr[j] > insert){
                arr[j+1] = arr[j]; // shifting
                j--; //move to prev index
            }
            arr[j+1] = insert; //place in correct pos
        }
        System.out.println("After sorting : ");
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
