class Animal{
    public void sound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    public void sound(){
        // when u want both methods to be printed
        // from parent and child => super keyword
        super.sound();
        System.out.println("Dogs bark");
    }
}
public class example2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
