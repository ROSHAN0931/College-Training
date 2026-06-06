import java.util.Scanner;

class Node2 {
    int data;
    Node next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node head;

    public void insertFront(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
    }
}

public class taskid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList2 list = new LinkedList2();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertFront(data);
        }

        list.display();
    }
}
