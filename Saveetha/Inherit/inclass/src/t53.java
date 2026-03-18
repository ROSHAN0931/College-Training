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

    public void displayVehicleInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    Car(String make, String model, int year, int numberOfDoors, String fuelType) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public void displayCarInfo() {
        System.out.println("Car Details:");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    int rangePerCharge;

    ElectricCar(String make, String model, int year, int numberOfDoors, String fuelType,
                int batteryCapacity, int rangePerCharge) {
        super(make, model, year, numberOfDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.rangePerCharge = rangePerCharge;
    }

    public void displayElectricCarInfo() {
        System.out.println("Electric Car Details:");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range Per Charge: " + rangePerCharge + " km");
    }
}

public class t53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the make of the vehicle:");
        String make = sc.nextLine();

        System.out.println("Enter the model of the vehicle:");
        String model = sc.nextLine();

        System.out.println("Enter the manufacturing year:");
        int year = sc.nextInt();

        System.out.println("Enter the number of doors:");
        int doors = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the fuel type:");
        String fuel = sc.nextLine();

        if (fuel.equalsIgnoreCase("Electric")) {
            System.out.println("Enter the battery capacity in kWh:");
            int battery = sc.nextInt();

            System.out.println("Enter the range per charge in km:");
            int range = sc.nextInt();

            ElectricCar ec = new ElectricCar(make, model, year, doors, fuel, battery, range);

            ec.displayVehicleInfo();
            ec.displayCarInfo();
            ec.displayElectricCarInfo();
        } else {
            Car car = new Car(make, model, year, doors, fuel);

            car.displayVehicleInfo();
            car.displayCarInfo();
        }
    }
}