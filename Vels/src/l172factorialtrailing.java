/*
Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Example 2:
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
 */

import java.util.Scanner;

public class l172factorialtrailing {
    public static int trailingZeroes(int n){
        int count = 0;
        while (n > 0){
            n = n / 5; // 0
            count = count + n; // 2
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // 10
        int res = trailingZeroes(n);
        System.out.println(res);
    }
}
