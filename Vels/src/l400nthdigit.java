import java.util.Scanner;

/*
Given an integer n, return the nth digit of the infinite integer sequence
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
Example 1:
Input: n = 3
Output: 3
Example 2:
Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0,
which is part of the number 10.
Constraints:
1 <= n <= 231 - 1
*/
public class l400nthdigit {
    public static int finddigit(int n){
        int digit = 1;
        long start = 1;
        long count = 9;

        while(n > digit * count){
            n = (int) (n - (digit * count)); // 11 - 9 =>2
            digit++; // 2
            count = count * 10;
            start = start * 10;
        }
        //find number
        long num = start + (n-1) / digit;

        //find digit
        String s = String.valueOf(num);
        return s.charAt((n-1) % digit) - '0';
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(finddigit(n));
    }
}
