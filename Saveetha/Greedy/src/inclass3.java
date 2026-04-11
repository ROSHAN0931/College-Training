import java.util.Arrays;
import java.util.Scanner;

public class inclass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt(); // arr time
            int b = in.nextInt(); // stoppage time
            arr[i] = a;
            dep[i] = a+b; // 12
        }
        Arrays.sort(arr); // 5 10 13
        Arrays.sort(dep); // 12 15 18
        int i = 0,j = 0;
        int platform = 0;
        int ans = 0;
        while (i < n && j < n){
            if (arr[i] < dep[j]){
                platform++;
                ans = Math.max(ans,platform);
                i++;
            }
            else {
                platform--;
                j++;
            }
        }
        System.out.println(ans);
    }
}
