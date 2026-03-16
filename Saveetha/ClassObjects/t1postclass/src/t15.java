import java.util.Scanner;

class Player {
    String name;
    String country;
    String skill;
}

public class t15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player p = new Player();

        System.out.println("Enter the player details");
        String input = sc.nextLine();

        String[] data = input.split(",");

        p.name = data[0];
        p.country = data[1];
        p.skill = data[2];

        System.out.println("Player Details ");
        System.out.println("Player Name : " + p.name);
        System.out.println("Country Name : " + p.country);
        System.out.println("Skill : " + p.skill);
    }
}