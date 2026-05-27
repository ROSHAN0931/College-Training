import java.util.Scanner;

public class l12integertoroman {
    public static String convert(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman ={"M","CM","D","CD","C","XC","L","XL","X",
                "IX","V","IV","I"};
        // 1253 => MCCLIII
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]){
                result.append(roman[i]); // MCCLIII
                num = num - values[i]; // 0
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = convert(n);
        System.out.println(res);
    }
}
