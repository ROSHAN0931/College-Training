import java.util.*;



public class tournament {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes (not needed further)
        sc.nextLine();

        String[] values = sc.nextLine().split(" ");

        if (values.length == 0 || values[0].equals("null")) {
            return;
        }

        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            Node current = queue.poll();

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                current.left = new Node(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                current.right = new Node(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }

        inorder(root);
    }
}