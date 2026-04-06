import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Size : ");
        int n = in.nextInt(); // 5
        System.out.println("Array ele : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // 2 7 11 15 3
        }
        int target = in.nextInt(); // 9
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int c = target - arr[i];
            if (map.containsKey(c)){
                System.out.println("Pair found " + c + " " + arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
    }
}
