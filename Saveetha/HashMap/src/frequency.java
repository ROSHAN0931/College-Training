import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = 0;
        int result = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > max) {
                max = freq;
                result = key;
            }
            else if (freq == max && key < result) {
                result = key;
            }
        }

        System.out.println(result);
    }
}