import java.util.Scanner;

class Team {
    String name;
    String coach;
    String location;
    String players;
    String captain;


    Team(String name, String coach, String location, String players, String captain) {
        this.name = name;
        this.coach = coach;
        this.location = location;
        this.players = players;
        this.captain = captain;
    }
}

public class t28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the team details");
        String input = sc.nextLine();

        String[] arr = input.split("#");

        Team t = new Team(arr[0], arr[1], arr[2], arr[3], arr[4]);

        System.out.println("Team: " + t.name);
        System.out.println("Coach: " + t.coach);
        System.out.println("Location: " + t.location);
        System.out.println("Players: " + t.players);
        System.out.println("Captain: " + t.captain);
    }
}