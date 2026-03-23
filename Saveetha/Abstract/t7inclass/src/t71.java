import java.util.Scanner;

// Abstract Class
abstract class Vehicle {
    String ownerName;
    String registrationNumber;

    Vehicle(String ownerName, String registrationNumber) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
    }

    abstract void displayDetails();
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String ownerName, String registrationNumber, int numberOfDoors) {
        super(ownerName, registrationNumber);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String ownerName, String registrationNumber, boolean hasSidecar) {
        super(ownerName, registrationNumber);
        this.hasSidecar = hasSidecar;
    }

    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class t71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of vehicle (1 for Car, 2 for Motorcycle): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter owner's name:");
        String ownerName = sc.nextLine();

        System.out.println("Enter registration number:");
        String regNumber = sc.nextLine();

        Vehicle vehicle;

        if (choice == 1) {
            System.out.println("Enter number of doors:");
            int doors = sc.nextInt();
            vehicle = new Car(ownerName, regNumber, doors);

        } else if (choice == 2) {
            System.out.println("Does it have a sidecar? (true/false):");
            boolean hasSidecar = sc.nextBoolean();
            vehicle = new Motorcycle(ownerName, regNumber, hasSidecar);

        } else {
            System.out.println("Invalid choice!");
            return;
        }

        vehicle.displayDetails();

        sc.close();
    }
}