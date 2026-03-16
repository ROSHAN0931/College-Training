import java.util.Scanner;

class Delivery{
    static long over,ball,runs;
    static String batsman,bowler,nonstriker;

    public static void display(){
        System.out.println("Over : " + over);
        System.out.println("Ball : " + ball);
        System.out.println("Runs : " + runs);
        System.out.println("Batsman : " + batsman);
        System.out.println("Bowler : " + bowler);
        System.out.println("NonStriker : " + nonstriker);
    }
}

public class t13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Delivery d = new Delivery();
        System.out.println("Enter the over");
        d.over = in.nextLong();
        System.out.println("Enter the ball");
        d.ball = in.nextLong();
        System.out.println("Enter the runs");
        d.runs = in.nextLong();
        in.nextLine();
        System.out.println("Enter the batsman name");
        d.batsman = in.nextLine();
        System.out.println("Enter the bowler name");
        d.bowler = in.nextLine();
        System.out.println("Enter the nonStriker name");
        d.nonstriker = in.nextLine();
        System.out.println("Delivery Details:");
        d.display();
    }
}
