interface Payment{
    void pay();
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Pay using UPI");
    }
}

class Card implements Payment{
    public void pay(){
        System.out.println("Pay using Card");
    }
}

public class abstract3 {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        p1.pay();
        p2.pay();
    }
}
