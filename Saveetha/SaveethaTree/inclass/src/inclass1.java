import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class inclass1 {
    public static Node insert(Node root,int val){
        Node newnode = new Node(val);
        if(root==null){
            return newnode;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node temp = q.poll();
            //insert left
            if(temp.left==null){
                temp.left = newnode;
                break;
            }
            else {
                q.add(temp.left);
            }
            //insert right
            if(temp.right==null){
                temp.right = newnode;
                break;
            }
            else {
                q.add(temp.right);
            }
        }
        return root;
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        //BFS - level order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left!=null){
                q.add(temp.left);
            }
            if (temp.right!=null){
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = null;
        for (int i =0;i<n;i++){
            int val = in.nextInt(); // 1 2 3 4 5 6
            root = insert(root,val);
        }
        levelOrder(root);
    }
}