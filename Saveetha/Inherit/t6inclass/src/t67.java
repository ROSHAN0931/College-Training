import java.util.Scanner;

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarDetails() {
        System.out.println("Car Details:");
        displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    public void displayTruckDetails() {
        System.out.println("Truck Details:");
        displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class t67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Car:");
        System.out.print("Make: ");
        String carMake = sc.nextLine();

        System.out.print("Model: ");
        String carModel = sc.nextLine();

        System.out.print("Year: ");
        int carYear = sc.nextInt();

        System.out.print("Number of Doors: ");
        int doors = sc.nextInt();

        sc.nextLine();
        System.out.println("\nEnter details for Truck:");
        System.out.print("Make: ");
        String truckMake = sc.nextLine();

        System.out.print("Model: ");
        String truckModel = sc.nextLine();

        System.out.print("Year: ");
        int truckYear = sc.nextInt();

        System.out.print("Load Capacity (in tons): ");
        double capacity = sc.nextDouble();

        Car car = new Car(carMake, carModel, carYear, doors);
        Truck truck = new Truck(truckMake, truckModel, truckYear, capacity);

        System.out.print("Car Details:\n");
        car.displayDetails();
        System.out.println("Number of Doors: " + doors);

        System.out.println();

        truck.displayTruckDetails();

        sc.close();
    }
}