import java.util.Scanner;

class Player{
    static String name;
    static String country;
    static String skill;

    public static void display(){
        System.out.println("Player Name : " + name);
        System.out.println("Country Name : " + country);
        System.out.println("Skill : " + skill);
    }
}

class t11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player p1 = new Player();
        System.out.println("Enter the player name");
        p1.name = in.nextLine();
        System.out.println("Enter the country name");
        p1.country = in.nextLine();
        System.out.println("Enter the skill");
        p1.skill = in.nextLine();
        System.out.println("Player Details:");
        p1.display();
    }
}