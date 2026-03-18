class Animals{
    void eat(){
        System.out.println("Eating");
    }
}

class Dogs extends Animals{
    void bark(){
        System.out.println("Barking");
    }
}

class Cats extends Animals{
    void display(){
        System.out.println("Cat Displayed");
    }
}

public class example3 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.bark();
        d.eat();
        Cats c = new Cats();
        c.display();
        c.eat();
    }
}
