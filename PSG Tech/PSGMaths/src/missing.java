/*
Missing Number

	arr = [1 2 4 5 6]
	mis = ? => 3

 */
import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}
