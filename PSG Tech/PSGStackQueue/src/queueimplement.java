public class queueimplement {
    static class Queue{
        int arr[];
        int front,rear,size;

        Queue(int capacity){
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }
        public void enqueue(int data){
            if (size==arr.length){
                System.out.println("Overflow");
                return;
            }
            if (front==-1){
                front++;
            }
            rear=rear+1;
            arr[rear]=data;
            size++;
        }
        public int peek(){
            if (size==0){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }

        public int dequeue(){
            if (size==0){
                System.out.println("Underflow");
            }
            int val = arr[front];//10
            front++;
            size--;
            return val;
        }
        public void display(){
            if (size==0){
                System.out.println("Empty");
                return;
            }
            for (int i=front;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
        }
        public boolean isEmpty(){
            return size==0;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println("Peek : " + q.peek());
        System.out.println("Print Q : ");
        q.display();
        System.out.println();
        System.out.println("Deleted : " + q.dequeue());
        q.display();
        System.out.println("Queue Empty ? : " + q.isEmpty());
    }
}
