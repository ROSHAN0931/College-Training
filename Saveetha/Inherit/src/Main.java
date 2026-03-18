import java.util.Scanner;

class Vehicles{
    String make;
    String model;
    int year;
    Vehicles(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayVehicleInfo(){
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Cars extends Vehicles{
    int numberOfDoors;
    String fuelType;
    Cars(String make,String model,int year,int numberOfDoors,String fuelType){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    public void displayCarInfo(){
        System.out.println("Car Details:");
        System.out.println("Number of Door: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class ElectricCar extends Cars{
    int batteryCapacity;
    int rangePerChange;
    ElectricCar(String make,String model,int year,int numberOfDoors,String fuelType,
                int batteryCapacity,int rangePerChange){
        super(make,model,year,numberOfDoors,fuelType);
        this.batteryCapacity = batteryCapacity;
        this.rangePerChange = rangePerChange;
    }
    public void displayElectricCarInfo(){
        System.out.println("Electric Car Details:");
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Range Per Change: " + rangePerChange);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the make of the vehicle:");
        String make = in.nextLine();

        System.out.println("Enter the model of the vehicle:");
        String model = in.nextLine();

        System.out.println("Enter the manufacturing year:");
        int year = in.nextInt();

        System.out.println("Enter the number of doors:");
        int doors = in.nextInt();
        in.nextLine();

        System.out.println("Enter the fuel type:");
        String fuel = in.nextLine();

        if (fuel.equalsIgnoreCase("Electric")){
            System.out.println("Enter the battery capacity:");
            int battery = in.nextInt();

            System.out.println("Enter the range per change:");
            int range = in.nextInt();

            ElectricCar ec = new ElectricCar(make,model,year,doors,fuel,battery,range);
            ec.displayVehicleInfo();
            ec.displayCarInfo();
            ec.displayElectricCarInfo();
        }
        else{
            Cars c = new Cars(make,model,year,doors,fuel);
            c.displayVehicleInfo();
            c.displayCarInfo();
        }
    }
}