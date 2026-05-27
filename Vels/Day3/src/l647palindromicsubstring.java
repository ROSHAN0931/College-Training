import java.util.Scanner;

public class l647palindromicsubstring {
    public static int countSubstrings(String s){
        int count = 0;
        // a   b   c
        // 0   1   2
        // ij
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s,int left,int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = countSubstrings(s);
        System.out.println(res);
    }
}
