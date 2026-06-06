class LL {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertfront(int data){
        Node newnode = new Node(data);
        if (head==null){
            head=newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertback(int data){
        Node newnode = new Node(data);//30
        if (head==null){
            head = newnode;  //10
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void insertmiddle(int data,int pos){
        Node newnode = new Node(data);
        if (pos==1){  // checking head
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        for (int i = 1;i < pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    //print list
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "=>");
            temp=temp.next;
        }
        // 10 20 30
    }
}
public class psg {
    public static void main(String[] args) {
        LL list = new LL(); // object for LL
        //insert 10
        list.insertback(10);
        list.insertback(20);
        list.insertback(30);

        list.insertmiddle(100,3);
        list.display();
    }
}
