import java.util.Scanner;

class Stack {
    int[] arr = new int[100];
    int top = -1;

    void push(int x) {
        if (top < 99) {
            arr[++top] = x;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }
}

public class airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Stack stack = new Stack();

        for (int i = 0; i < n; i++) {
            String cmd = sc.nextLine();

            if (cmd.startsWith("Push")) {
                int val = Integer.parseInt(cmd.split(" ")[1]);
                stack.push(val);
            }
            else if (cmd.equals("Pop")) {
                stack.pop();
            }
            else if (cmd.equals("Top")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println("Stack Underflow");
                }
            }
            else if (cmd.equals("IsEmpty")) {
                System.out.println(stack.isEmpty());
            }
            else if (cmd.equals("Size")) {
                System.out.println(stack.size());
            }
        }
    }
}