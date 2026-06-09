import java.util.Scanner;

public class preorderstyle {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Scanner in = new Scanner(System.in);
    static Node createTree(){
        int data = in.nextInt();// -1
        if (data==-1){
            return null;
        }
        Node root = new Node(data);
        root.left = createTree(); //-1
        root.right = createTree(); // 56789
        return root;
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Enter Nodes (-1 is Null):");
        Node root = createTree();
        System.out.println("Inorder : ");
        inorder(root);
    }
}
