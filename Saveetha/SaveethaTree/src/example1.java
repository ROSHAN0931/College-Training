class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class example1 {
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(25);
        root.right.left = new Node(15);
        root.left.left = new Node(30);
        root.right.right = new Node(99);
        System.out.println("Inorder Traversal : ");
        inorder(root);
    }
}