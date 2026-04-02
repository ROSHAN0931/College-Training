
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {

    static int count = 0;
    static int result = -1;

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder to find Kth smallest
    public static void inorder(Node root, int k) {
        if (root == null || result != -1) return;

        inorder(root.left, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        // Build BST
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int k = sc.nextInt();

        inorder(root, k);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("k is out of range");
        }
    }
}
