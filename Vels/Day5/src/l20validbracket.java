import java.util.Scanner;
import java.util.Stack;

public class l20validbracket {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            switch (ch){
                case '(': case '{': case '[':
                    st.push(ch);
                    break;
                case ')':
                    if (st.isEmpty() || st.pop()!='('){
                        return false;
                    }
                    break;
                case '}':
                    if (st.isEmpty() || st.pop()!='{'){
                        return false;
                    }
                    break;
                case ']':
                    if (st.isEmpty() || st.pop()!='['){
                        return false;
                    }
                    break;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(isValid(s)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}