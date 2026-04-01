import java.util.Scanner;

class eNode{
    int data;
    eNode left,right;
    eNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class example2{
    static Scanner in;
    public static eNode buildTree(){
        int val = in.nextInt(); // 1
        if(val==-1){
            return null;
        }
        eNode root = new eNode(val);
        root.left = buildTree();
        root.right = buildTree();
        return root;
    }
    public static void inorder(eNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }
    public static void preorder(eNode root){
        if (root==null){
            return;
        }
        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(eNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "->");
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        eNode root = buildTree();
        System.out.println("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder : ");
        postorder(root);
        in.close();
    }
}