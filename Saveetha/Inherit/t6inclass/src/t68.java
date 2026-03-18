import java.util.Scanner;

class Players {
    String name;
    int age;
    String team;

    Players(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
    }
}

class Batsman extends Players {
    int runsScored;

    Batsman(String name, int age, String team, int runsScored) {
        super(name, age, team);
        this.runsScored = runsScored;
    }

    public void displayBatsmanDetails() {
        System.out.println("Batsman Details:");
        displayDetails();
        System.out.println("Runs Scored: " + runsScored);
    }
}

class Bowlers extends Players {
    int wicketsTaken;

    Bowlers(String name, int age, String team, int wicketsTaken) {
        super(name, age, team);
        this.wicketsTaken = wicketsTaken;
    }

    public void displayBowlerDetails() {
        System.out.println("Bowler Details:");
        displayDetails();
        System.out.println("Wickets Taken: " + wicketsTaken);
    }
}

public class t68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Batsman:");
        System.out.print("Name: ");
        String bName = sc.nextLine();

        System.out.print("Age: ");
        int bAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Team: ");
        String bTeam = sc.nextLine();

        System.out.print("Runs Scored: ");
        int runs = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter details for Bowler:");
        System.out.print("Name: ");
        String bowName = sc.nextLine();

        System.out.print("Age: ");
        int bowAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Team: ");
        String bowTeam = sc.nextLine();

        System.out.print("Wickets Taken: ");
        int wickets = sc.nextInt();

        Batsman batsman = new Batsman(bName, bAge, bTeam, runs);
        Bowlers bowler = new Bowlers(bowName, bowAge, bowTeam, wickets);

        System.out.println();
        batsman.displayBatsmanDetails();
        System.out.println();
        bowler.displayBowlerDetails();

        sc.close();
    }
}