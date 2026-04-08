import java.util.HashSet;

public class duplicatesFind {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1};
        //Normal - Time - O(n*n),Space - O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("True");
                    return;
                }
            }
        }
        // Optimised - Time - O(n), Space - O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            if (!set.add(num)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}
