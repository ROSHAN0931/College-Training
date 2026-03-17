import java.util.Scanner;

class Player {
    private String name;
    private String country;
    private String skill;

    // 3-argument constructor
    public Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    // toString method with formatting
    public String toString() {
        return String.format("%-15s%-15s%-15s", name, country, skill);
    }
}

class PlayerBO {

    public void displayPlayerDetails(Player[] playerList) {
        System.out.println("Player Details");

        for (Player p : playerList) {
            System.out.println(p.toString());
        }
    }
}

public class t48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] list = new Player[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the player name");
            String name = sc.nextLine();

            System.out.println("Enter the country name");
            String country = sc.nextLine();

            System.out.println("Enter the skill");
            String skill = sc.nextLine();

            list[i] = new Player(name, country, skill);
        }

        PlayerBO obj = new PlayerBO();
        obj.displayPlayerDetails(list);
    }
}