import java.util.Stack;

public class stackimplement {
    static class Stack{
        int[] arr;
        int top;

        Stack(int size){
            arr = new int[size];
            top = -1;
        }

        public void push(int data){
            if (top==arr.length-1){
                System.out.println("Overflow");
                return;
            }
            arr[++top] = data;
        }

        public int pop(){
            if(top==-1){
                System.out.println("Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek(){
            if (top==-1){
                System.out.println("Stack Empty");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty(){
            return top==-1;
        }
        public void display(){
            if (top==-1){
                System.out.println("Empty");
                return;
            }
            for (int i = top; i >= 0;i--){
                System.out.print(arr[i] + "->");
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top : " + s.peek());//30
        System.out.println("Popped : " + s.pop());
        System.out.println("Stack Empty ? : " + s.isEmpty());
        System.out.println("Print Stack : ");
        s.display();
        System.out.println();
        System.out.println(s.peek());
    }
}