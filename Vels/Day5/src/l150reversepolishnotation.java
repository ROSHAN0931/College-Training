import java.util.Scanner;
import java.util.Stack;

public class l150reversepolishnotation {
    public static int evalRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for (String val : tokens){
            if (val.equals("+") || val.equals("-") ||
            val.equals("*") || val.equals("/")){
                int b = st.pop();
                int a = st.pop();

                switch (val){
                    case "+": st.push(a+b);break;
                    case "-": st.push(a-b);break;
                    case "*": st.push(a*b);break;
                    case "/": st.push(a/b);break;
                }
            }
            else{
                st.push(Integer.parseInt(val));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        int res = evalRPN(arr);
        System.out.println(res);
    }
}
