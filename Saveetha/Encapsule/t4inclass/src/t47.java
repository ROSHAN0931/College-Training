import java.util.Scanner;

class Delivery {
    private long over;
    private long ball;
    private String batsman;
    private String bowler;
    private String nonStriker;

    // 5-argument constructor
    public Delivery(long over, long ball, String batsman, String bowler, String nonStriker) {
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }

    // Getters and Setters
    public long getOver() {
        return over;
    }

    public void setOver(long over) {
        this.over = over;
    }

    public long getBall() {
        return ball;
    }

    public void setBall(long ball) {
        this.ball = ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    // toString method
    public String toString() {
        return "Over : " + over + "\n" +
                "Ball : " + ball + "\n" +
                "Batsman : " + batsman + "\n" +
                "Bowler : " + bowler + "\n" +
                "NonStriker : " + nonStriker;
    }
}

class DeliveryBO {

    public void displayAllDeliveryDetails(Delivery[] deliveryList) {
        System.out.println("Delivery Details");

        for (int i = 0; i < deliveryList.length; i++) {
            System.out.println("Delivery -- " + (i + 1));
            System.out.println(deliveryList[i].toString());
        }
    }
}

public class t47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of deliveries");
        int n = sc.nextInt();
        sc.nextLine();

        Delivery[] list = new Delivery[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the over");
            long over = sc.nextLong();

            System.out.println("Enter the ball");
            long ball = sc.nextLong();
            sc.nextLine();

            System.out.println("Enter the batsman");
            String batsman = sc.nextLine();

            System.out.println("Enter the bowler");
            String bowler = sc.nextLine();

            System.out.println("Enter the nonStriker");
            String nonStriker = sc.nextLine();

            list[i] = new Delivery(over, ball, batsman, bowler, nonStriker);
        }

        DeliveryBO obj = new DeliveryBO();
        obj.displayAllDeliveryDetails(list);
    }
}