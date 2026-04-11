import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class inclass4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char arr[] = str.toCharArray();
        int last[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 9; j > arr[i] - '0' ; j--) {
                if (last[j] > i) {
                    char temp = arr[i];
                    arr[i] = arr[last[j]];
                    arr[last[j]] = temp;
                    System.out.println(new String(arr));
                    return;
                }
            }
        }
        System.out.println(str);
    }
}
