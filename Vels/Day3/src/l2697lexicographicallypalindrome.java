import java.util.Scanner;

public class l2697lexicographicallypalindrome {
    public static String makeSmallestPalindrome(String s){
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        // abcd
        while (left < right){
            if (arr[left] != arr[right]){
                char smaller = (char)Math.min(arr[left],arr[right]);//a
                arr[left] = smaller;
                arr[right] = smaller;
            }
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = makeSmallestPalindrome(s);
        System.out.println(res);
    }
}
