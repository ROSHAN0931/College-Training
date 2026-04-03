import java.util.PriorityQueue;
import java.util.Scanner;
public class MINHEAP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        System.out.println("Enter the size : ");
        int n = in.nextInt(); // 5
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            minHeap.add(val); // 4 8 1 2 6
        }
        System.out.println("Min Heap : ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + "->");
        }
    }
}