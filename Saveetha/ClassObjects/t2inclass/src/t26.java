import java.util.Scanner;

class Venue {
    String name;
    String city;

    Venue(String name, String city) {
        this.name = name; // Wankhede Stadium
        this.city = city; // Mumbai
    }

    void display() {
        System.out.println("Venue Details");
        System.out.println("Venue Name : " + name);
        System.out.println("City Name : " + city);
    }
}

public class t26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue details");
        String input = sc.nextLine(); // Wankhede Stadium, Mumbai

        String[] data = input.split(","); // [Wankhede Stadium , Mumbai]

        String name = data[0].trim();
        String city = data[1].trim();

        Venue v = new Venue(name, city);  //(Wankhede Stadium , Mumbai)
        System.out.println();
        v.display();
    }
}