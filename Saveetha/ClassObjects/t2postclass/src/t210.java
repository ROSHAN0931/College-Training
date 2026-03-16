import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    double price;
    double engineCapacity;

    Car(String brand, String model, int year, double price, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Engine Capacity: " + engineCapacity + " L");
    }
}

public class t210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand of the car:");
        String brand = sc.nextLine();

        System.out.println("Enter the model of the car:");
        String model = sc.nextLine();

        System.out.println("Enter the year of manufacture:");
        int year = sc.nextInt();

        System.out.println("Enter the price of the car:");
        double price = sc.nextDouble();

        System.out.println("Enter the engine capacity of the car:");
        double engineCapacity = sc.nextDouble();

        if (year <= 1885 || price <= 0 || engineCapacity <= 0) {
            System.out.println("Invalid Input");
        } else {
            Car c = new Car(brand, model, year, price, engineCapacity);
            c.displayCarDetails();
        }
    }
}