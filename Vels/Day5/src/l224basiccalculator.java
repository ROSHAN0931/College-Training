import java.util.Scanner;
import java.util.Stack;

public class l224basiccalculator {
    public static int calculate(String s){
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                num = num * 10 + (ch-'0');
            }
            else if (ch=='+') {
                res = res + (num * sign);
                num = 0;
                sign = 1;
            }
            else if (ch=='-') {
                res = res + (num * sign);
                num = 0;
                sign = -1;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            }
            else if (ch==')') {
                res = res + (sign * num);
                num = 0;
                int prevsign = st.pop();
                int prevval = st.pop();
                res = prevval + (prevsign * res);
            }
        }
        res = res + (sign * num);
        num = 0;
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = calculate(s);
        System.out.println(res);
    }
}
