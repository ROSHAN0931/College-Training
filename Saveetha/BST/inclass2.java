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

    // Search in BST
    public static Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        // Build BST
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int val = sc.nextInt();

        Node found = search(root, val);

        if (found != null) {
            System.out.println("Book found! Subtree rooted at " + val + ":");
            inorder(found);
        } else {
            System.out.println("Book not found");
        }
    }
}
