import java.util.Arrays;

public class mergeSort {
    public static void mergesort(int[] arr,int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2; // 2
            //left
            mergesort(arr,left,mid);
            //right
            mergesort(arr,mid+1,right);
            //merge everything
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int n1 = mid - left + 1; // left size
        int n2 = right - mid; // right size

        int L[] = new int[n1];
        int R[] = new int[n2];
        //Copy the data to left and right arr
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[mid + 1 + j];
        }
        //merge the left and right
        int i=0,j=0,k=left;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // copy remaining elements
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,4,2};
        mergesort(arr,0,arr.length-1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}
