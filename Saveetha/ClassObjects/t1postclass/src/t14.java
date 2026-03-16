import java.util.Scanner;

class Innings {
    String number;
    String battingTeam;
    long runs;

    void displayInningsDetails() {
        System.out.println("Innings Details :");
        System.out.println("Innings number : " + number);
        System.out.println("BattingTeam :" + battingTeam);
        System.out.println("Runs scored :" + runs);
    }
}

public class t14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Innings in = new Innings();

        System.out.println("Enter the innings number");
        in.number = sc.nextLine();

        System.out.println("Enter the BattingTeam");
        in.battingTeam = sc.nextLine();

        System.out.println("Enter the runs scored");
        in.runs = sc.nextLong();

        in.displayInningsDetails();
    }
}