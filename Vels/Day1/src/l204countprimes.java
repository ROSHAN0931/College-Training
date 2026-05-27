/*
Given an integer n, return the number of prime numbers that are
strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10,
they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
 */

import java.util.Scanner;

public class l204countprimes {
    public static int countPrimes(int n){
        if (n<=2){
            return 0;
        }
        boolean isprime[] = new boolean[n];
        for (int i = 2; i < n; i++) {
            isprime[i] = true;
        }
        for (int i = 2; i*i < n; i++) {
            if (isprime[i]){
                for (int j = i*i; j < n; j+=i) {
                    isprime[j]=false;
                }
            }
        }
        int count =0;
        for (int i = 2; i < n; i++) {
            if (isprime[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = countPrimes(n);
        System.out.println(res);
    }
}
