
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

    // Find LCA
    public static Node findLCA(Node root, int p, int q) {
        if (root == null) return null;

        if (p < root.data && q < root.data) {
            return findLCA(root.left, p, q);
        }

        if (p > root.data && q > root.data) {
            return findLCA(root.right, p, q);
        }

        return root; // split point → LCA
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        // Build BST
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        Node lca = findLCA(root, p, q);

        if (lca != null) {
            System.out.println(lca.data);
        }
    }
}
