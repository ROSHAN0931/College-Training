import java.util.Scanner;

class Queue1 {
    String[] arr;
    int front, rear, size, capacity;

    Queue1(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(String customer) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot add " + customer);
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = customer;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Served Customer: Queue is empty. No customer to serve.");
            return;
        }

        System.out.println("Served Customer: " + arr[front]);
        front = (front + 1) % capacity;
        size--;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Current Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        Queue1 queue = new Queue1(capacity);

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.startsWith("ENQUEUE")) {
                String customer = command.substring(8).trim();
                queue.enqueue(customer);
            } else if (command.equals("DEQUEUE")) {
                queue.dequeue();
            } else if (command.equals("DISPLAY")) {
                queue.display();
            }
        }

        sc.close();
    }
}