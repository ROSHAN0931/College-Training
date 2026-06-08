public class queuelinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static class QL {
            Node front, rear;

            public void enqueue(int data) {
                Node newnode = new Node(data);
                if (rear == null) {
                    front = rear = newnode;
                    return;
                }
                rear.next= newnode;
                rear=newnode;
            }
            public int peek(){
                if (front==null){
                    System.out.println("Empty");
                    return -1;
                }
                return front.data;
            }
            public int dequeue(){
                if (front==null){
                    System.out.println("Empty");
                    return -1;
                }
                int val = front.data;
                front = front.next;
                return val;
            }
            public void display(){
                Node temp = front;
                while (temp!=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
            public boolean isEmpty(){
                return front==null;
            }
        }

        public static void main(String[] args) {
            QL list = new QL();
            list.enqueue(10);
            list.enqueue(20);
            list.enqueue(30);
            System.out.println("Peeked : " + list.peek());
            System.out.println("Deleted : " + list.dequeue());
            System.out.println("Print Q : ");
            list.display();
            System.out.println("Empty ? : " + list.isEmpty());
        }

}
