public class btimplement {
    static class Node{
        int data;
        Node left,right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preoder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data + " ");
        preoder(root.left);
        preoder(root.right);
    }

    public static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        System.out.println("Inorder : ");
        inorder(root);
        System.out.println("\nPreorder : ");
        preoder(root);
        System.out.println("\nPostorder : ");
        postorder(root);
    }
}