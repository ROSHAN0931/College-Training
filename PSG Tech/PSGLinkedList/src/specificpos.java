import java.util.Scanner;

class Node3 {
    int data;
    Node next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList3 {
    Node head;

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void insertAtPosition(int pos, int data) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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

public class specificpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList3 list = new LinkedList3();

        for (int i = 0; i < n; i++) {
            list.insertEnd(sc.nextInt());
        }

        int pos = sc.nextInt();
        int value = sc.nextInt();

        list.insertAtPosition(pos, value);
        list.display();
    }
}
