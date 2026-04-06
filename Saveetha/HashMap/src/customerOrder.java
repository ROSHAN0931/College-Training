import java.util.HashMap;
import java.util.Scanner;
public class customerOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            map.put(key,value);
        }
        int search = in.nextInt();
        for (int i = 0; i < search; i++) {
            int k = in.nextInt();
            if (map.containsKey(k)){
                System.out.println(map.get(k));
            }
            else {
                System.out.println("Employee not found");
            }
        }
    }
}
