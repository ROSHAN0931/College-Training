import java.util.Scanner;

class Delivery{
    static private int over,ball,runs;
    static private String batsman,bowler,nonstriker;

    Delivery(int over,int ball,int runs,String batsman,String bowler,String nonstriker){
        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonstriker = nonstriker;
    }

    public static void display(){
        System.out.println("Over: " + over);
        System.out.println("Ball: " + ball);
        System.out.println("Runs: " + runs);
        System.out.println("Batsman: " + batsman);
        System.out.println("Bowler: " + bowler);
        System.out.println("NonStriker: " + nonstriker);
    }
}

public class t27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the over");
        int o = in.nextInt();
        System.out.println("Enter the ball");
        int b = in.nextInt();
        System.out.println("Enter the runs");
        int r = in.nextInt();
        in.nextLine();
        System.out.println("Enter the batsman name");
        String bat = in.nextLine();
        System.out.println("Enter the bowler name");
        String bowl = in.nextLine();
        System.out.println("Enter the nonStriker name");
        String non = in.nextLine();

        Delivery d = new Delivery(o,b,r,bat,bowl,non);
        d.display();
    }
}
