import java.util.Scanner;

class Venue{
    static String venueName;
    static String cityName;

    public static void display(){
        System.out.println("Venue Name : " + venueName);
        System.out.println("City Name : " + cityName);
    }
}

public class t12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Venue v = new Venue();
        System.out.println("Enter the venue name");
        v.venueName = in.nextLine();
        System.out.println("Enter the city name");
        v.cityName = in.nextLine();
        System.out.println("Venue Details");
        v.display();
    }
}
