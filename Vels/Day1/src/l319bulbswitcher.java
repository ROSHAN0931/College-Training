/*
There are n bulbs that are initially off. You first turn on all the
bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's
off or turning off if it's on). For the ith round, you toggle every i
bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.
 */

import java.util.Scanner;

public class l319bulbswitcher {
    public static int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = bulbSwitch(n);
        System.out.println(res);
    }
}
