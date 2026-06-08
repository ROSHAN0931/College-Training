public class stacklinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class SL{
        Node top;
        public void push(int data){
            Node newnode = new Node(data);
            newnode.next = top;
            top = newnode;
        }

        public int pop(){
            if (top==null){
                System.out.println("Empty");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        public int peek(){
            if (top==null){
                System.out.println("Empty");
                return -1;
            }
            return top.data;
        }
        public void display(){
            Node temp = top;
            while (temp!=null){
                System.out.print(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        SL list = new SL();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println("Top : " + list.peek());
        System.out.println("Popped : " + list.pop());
        System.out.println("Print Stack : ");
        list.display();
    }
}
