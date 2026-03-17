import java.util.Scanner;

class BankAccount{
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public void deposit(int deposit){
        balance = balance + deposit;
    }
    public int getBalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the current balance : ");
        int balance = in.nextInt(); //1000
        BankAccount ba = new BankAccount();
        ba.setBalance(balance);
        System.out.println("Current Balance : " + ba.getBalance());
        System.out.println("Enter the amount to be deposited : ");
        int dep = in.nextInt(); //700
        ba.deposit(dep);
        System.out.println("After deposit : " + ba.getBalance());
    }
}