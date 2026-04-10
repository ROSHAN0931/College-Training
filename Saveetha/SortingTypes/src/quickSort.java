import java.util.Arrays;

public class quickSort {
    public static int partition(int arr[],int left,int right){
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }
    public static void quicksort(int[] arr,int left,int right){
        if (left < right) {
            int pivot = partition(arr, left, right);
            quicksort(arr,left,pivot-1);
            quicksort(arr,pivot+1,right);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,5,9,6};
        quicksort(arr,0,arr.length-1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}
