import java.util.*;

abstract class payment {
    protected double amount;

    payment(double amount) {
        this.amount = amount;
    }

    abstract void makepayment();
}

class creditcardpayment extends payment {
    String cardno;
    int cvv;

    creditcardpayment(double amt, String cardno, int cvv) {
        super(amt);
        this.cardno = cardno;
        this.cvv = cvv;
    }

    void makepayment() {
        System.out.println("Payment of $" + amount + " processed using Credit Card.");
        System.out.println("Card Number: " + cardno);
    }
}

class debitcardpayment extends payment {
    String cardno;

    debitcardpayment(double amt, String cardno) {
        super(amt);
        this.cardno = cardno;
    }

    void makepayment() {
        System.out.println("Payment of $" + amount + " processed using Debit Card.");
        System.out.println("Card Number: " + cardno);
    }
}

class digitalwalletpayment extends payment {
    String walletid;

    digitalwalletpayment(double amt, String walletid) {
        super(amt);
        this.walletid = walletid;
    }

    void makepayment() {
        System.out.println("Payment of $" + amount + " processed using Digital Wallet.");
        System.out.println("Wallet ID: " + walletid);
    }
}

class t81{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. Digital Wallet");

        int choice = sc.nextInt();

        System.out.println("Enter payment amount:");
        double amt = sc.nextDouble();
        sc.nextLine();

        payment p;

        if (choice == 1) {
            System.out.println("Enter credit card number:");
            String card = sc.nextLine();

            System.out.println("Enter CVV:");
            int cvv = sc.nextInt();

            p = new creditcardpayment(amt, card, cvv);
        }
        else if (choice == 2) {
            System.out.println("Enter debit card number:");
            String card = sc.nextLine();

            p = new debitcardpayment(amt, card);
        }
        else if (choice == 3) {
            System.out.println("Enter wallet ID:");
            String wid = sc.nextLine();

            p = new digitalwalletpayment(amt, wid);
        }
        else {
            System.out.println("Invalid choice.");
            return;
        }

        p.makepayment();
    }
}