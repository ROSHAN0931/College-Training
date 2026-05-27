import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class l3longestsubstringwithoutrepeatingchar {
    public static int lengthOfLongestSubstring(String s){
        int start =0;
        int end = 0;
        int maxlen = 0;
        // a b c a b c b b => 8
        //   s
        //       e
        List<Character> list = new ArrayList<>();
        while (end < s.length()){
            if (!list.contains(s.charAt(end))){
                list.add(s.charAt(end)); // a b c
                end++;// 3
                maxlen = Math.max(maxlen,list.size()); // 3
            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));// a
                start++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
