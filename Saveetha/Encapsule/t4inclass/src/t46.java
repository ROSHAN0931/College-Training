import java.util.Scanner;

class Venue {
    private String name;
    private String city;

    public Venue(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method
    public String toString() {
        return name + "," + city;
    }
}

class VenueBO {
    public void displayVenueDetails(Venue venue) {
        System.out.println("Venue Details");
        System.out.println(venue.toString());
    }
}

public class t46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue name");
        String name = sc.nextLine();

        System.out.println("Enter the city name");
        String city = sc.nextLine();

        Venue venue = new Venue(name, city);
        VenueBO venueBO = new VenueBO();

        venueBO.displayVenueDetails(venue);
    }
}