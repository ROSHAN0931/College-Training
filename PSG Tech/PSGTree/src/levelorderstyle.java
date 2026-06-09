import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelorderstyle {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter root : ");
        int data = in.nextInt();// 10
        if (data==-1){
            return;
        }
        Node root = new Node(data);// 10
        Queue<Node> q = new LinkedList<>();//bfs or level
        q.offer(root);//10
        while (!q.isEmpty()){
            Node current = q.poll(); //30
            System.out.println("Left child : " );
            int leftdata = in.nextInt(); //45
            if (leftdata!=-1){
                current.left = new Node(leftdata);
                q.offer(current.left);
            }
            System.out.println("Right child : ");
            int rightdata = in.nextInt();//55
            if (rightdata!=-1){
                current.right = new Node(rightdata);
                q.offer(current.right);
            }
        }
        System.out.println("Inorder : ");
        inorder(root);
        System.out.println("\nCount nodes : " + countnodes(root));
        System.out.println("Count leaf : " + countleaf(root));
        System.out.println("Height : " + height(root));
        System.out.println("Enter data to search : ");
        int val = in.nextInt(); //4
        System.out.println(find(root,val));
        System.out.println("Sum of nodes : " + sum(root));
        mirror(root);
        inorder(root);
    }

    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static int countnodes(Node root){
        if (root==null){
            return 0;
        }
        return 1 + countnodes(root.left) + countnodes(root.right);
    }
    public static int countleaf(Node root){
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 1;
        }
        return countleaf(root.left) + countleaf(root.right);
    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static boolean find(Node root,int val){
        if (root==null){
            return false;
        }
        if (root.data==val){
            return true;
        }
        return find(root.left,val) || find(root.right,val);
    }
    public static int sum(Node root){
        if (root==null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    public static void mirror(Node root){
        if (root==null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
