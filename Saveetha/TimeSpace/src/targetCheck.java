import java.util.HashMap;

public class targetCheck {
    public static void main(String[] args) {
        int arr[] = {2,7,11,13};
        int target = 9;
        // Normal Approach - Time - O(n*n), Space - O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(i + " " + j);
                }
            }
        }
        // Optimised Approach - Time - O(n), Space - O(1)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c = target - arr[i];
            if (map.containsKey(c)){
                System.out.println(map.get(c));
            }
            map.put(arr[i],i);
        }
    }
}