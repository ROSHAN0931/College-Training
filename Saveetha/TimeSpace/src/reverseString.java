public class reverseString {
    public static void main(String[] args) {
        String val = "Roshan";
        String rev = "";
        //Normal - Time - O(n) - Space - O(n)
        for (int i = 0 ; i < val.length(); i++) {
            rev = val.charAt(i) + rev;//oR
        }
        System.out.println(rev);
        // Optimised - Time - O(n),Space O(n)
        StringBuilder sb = new StringBuilder(val);
        System.out.println(sb.reverse());
    }
}
