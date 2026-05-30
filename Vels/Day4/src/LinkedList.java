import java.util.ArrayList;

class Node{
    int data;
    Node next;

    //constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    LinkedList(){
        head = null;
    }

    public void insertend(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void insertfront(int data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
        }
        newnode.next = head;
        head = newnode;
    }

    public void reverse(){
        // 10 -> 20 -> 30 -> null
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public boolean isPalindrome(){
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size()-1;
        while (left < right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void rotate(int k){
        if (head==null){
            //return null
            System.out.println("null");
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp!=null){
            arr.add(temp.data);
            temp = temp.next;
        }
        int n = arr.size(); // 4
        k = k%n;

        //rotating
        for (int i = 0; i < k; i++) {
            int last = arr.remove(n-1);
            arr.add(0,last);
        }
        //put values back into linkedlist
        temp = head;
        int i=0;
        while (temp!=null){
            temp.data = arr.get(i);
            i++;
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertend(1);
        list.insertend(2);
        list.insertend(21);
        list.insertend(1);
        list.display();
        list.reverse();
        list.display();
        if (list.isPalindrome()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        int k = 2;
        list.rotate(k);
    }
}