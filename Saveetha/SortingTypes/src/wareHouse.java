import java.util.*;

public class wareHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m + n];
        for(int i = 0; i < m + n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1, m, arr2, n);

        for(int num : arr1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy remaining elements of arr2 (if any)
        while(j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
}