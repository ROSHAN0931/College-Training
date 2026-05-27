import java.util.*;

public class l49groupanagrams {
    public static List<List<String>> groupAnagrams(String[] str){
        Map<String, List<String>> map = new HashMap<>();
        // ate, eat, tab, bat, tea
        for(String s : str){
            char[] arr = s.toCharArray(); // [e,a,t]
            Arrays.sort(arr); // [a,e,t]
            String key = new String(arr);// abt

            map.computeIfAbsent(key,k -> new ArrayList<>()).add(s);

            // "aet" : [ate,eat,tea]
            // "abt" : [tab,bat]
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }
        List<List<String>> res = groupAnagrams(str);
        System.out.println(res);
    }
}
