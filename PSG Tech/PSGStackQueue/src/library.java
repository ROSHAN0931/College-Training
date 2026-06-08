import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Stack2 {
    Node top;
    int size = 0;

    void push(String book) {
        Node newNode = new Node(book);
        newNode.next = top;
        top = newNode;
        size++;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            top = top.next;
            size--;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data);
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {
        return size;
    }
}

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Stack2 stack = new Stack2();

        for (int i = 0; i < n; i++) {
            String cmd = sc.nextLine();

            if (cmd.startsWith("Push")) {
                String book = cmd.substring(5);
                stack.push(book);
            }
            else if (cmd.equals("Pop")) {
                stack.pop();
            }
            else if (cmd.equals("Top")) {
                stack.peek();
            }
            else if (cmd.equals("IsEmpty")) {
                System.out.println(stack.isEmpty());
            }
            else if (cmd.equals("Size")) {
                System.out.println(stack.size());
            }
        }

        sc.close();
    }
}