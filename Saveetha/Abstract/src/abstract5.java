interface SmartDevice{
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice{
    public void turnOn(){
        System.out.println("Fan in On");
    }

    public void turnOff() {
        System.out.println("Fan is Off");
    }
}

class Light implements SmartDevice{
    public void turnOn() {
        System.out.println("Light is On");
    }

    public void turnOff() {
        System.out.println("Light is Off");
    }
}

public class abstract5 {
    public static void main(String[] args) {
        SmartDevice f = new Fan();
        SmartDevice l = new Light();
        f.turnOn();
        f.turnOff();
        l.turnOn();
        l.turnOff();
    }
}
