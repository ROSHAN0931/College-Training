public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,8,4,2};
        //selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j; // 4
                }
            }
            //swap
            int temp = arr[i]; // 5
            arr[i] = arr[minIndex]; // 2
            arr[minIndex] = temp; //5
        }
        System.out.println("After sorting : ");
        for (int x  : arr){
            System.out.print(x + " ");
        }
    }
}
