import java.util.Scanner;

class Player{
    String name;
    String team;
    int age;
    Player(String name,String team,int age){
        this.name = name;
        this.team = team;
        this.age = age;
    }
    public void displayPlayerInfo(){
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Team: " + team);
        System.out.println("Age:" + age);
    }
}

class Bowler extends Player{
    int wickets;
    double bowlingAverage;
    Bowler(String name,String team,int age,int wickets,double bowlingAverage){
        super(name,team,age);
        this.wickets = wickets;
        this.bowlingAverage = bowlingAverage;
    }
    public void displayBowlingStats(){
        System.out.println("Bowling Statistics:");
        System.out.println("Wickets Taken: " + wickets);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}
public class t51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the player's name:");
        String name = in.nextLine();
        System.out.println("Enter the player's team:");
        String team = in.nextLine();
        System.out.println("Enter the player's age:");
        int age = in.nextInt();
        System.out.println("Enter the number of wickets taken:");
        int wickets = in.nextInt();
        System.out.println("Enter the bowling average:");
        double average = in.nextDouble();
        Bowler p = new Bowler(name,team,age,wickets,average);
        p.displayPlayerInfo();
        p.displayBowlingStats();
    }
}