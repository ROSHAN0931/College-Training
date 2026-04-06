import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 4
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr); // 10 11 12 15
        int start = in.nextInt(); //10
        int end = in.nextInt(); //15

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        for (int i = start; i <= end ; i++) {
            if (!set.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
