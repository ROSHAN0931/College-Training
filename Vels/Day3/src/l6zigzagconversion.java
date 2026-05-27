import java.util.Scanner;

public class l6zigzagconversion {
    public static String convert(String s, int numRows){
        if (numRows==1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean move = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // P A Y
            rows[currentRow].append(c);
            if (currentRow==0 || currentRow==numRows-1){
                move = !move;//false// up
            }
            currentRow += move? 1 : -1;
            // cr = 2 - 1 => 1
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < rows.length; i++) {
            res.append(rows[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int rows = in.nextInt();
        String res = convert(s,rows);
        System.out.println(res);
    }
}
