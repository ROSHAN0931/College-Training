import java.util.Scanner;
public class l678validparanthesisstring {
    public static boolean checkValidString(String s){
        int a=0;
        int b=0;
        // (*)
        for (char ch : s.toCharArray()){
            if (ch=='('){
                a++;//
                b++;//
            }
            else if (ch==')') {
                a--;// -1
                b--;// -1
            }
            else {  // *
                a--; // 0
                b++;// 2
            }
            if (b < 0){
                return false; // if starting bracket is closing
            }
            if (a < 0){
                a = 0; // open brackets will not be an negative value
                       // instead it starts from zero
            }
        }
        return a==0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (checkValidString(s)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
