class Vehicle{
    public void run(){
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle{
    public void display(){
        System.out.println("Child class");
    }
}
public class example1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.display();
    }
}
