abstract class Bank{
    abstract int intrestRate();
}

class SBI extends Bank{
    int intrestRate(){
        return 7;
    }
}

class HDFC extends Bank{
    int intrestRate(){
        return 10;
    }
}

public class abstract2 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println(b1.intrestRate());
        System.out.println(b2.intrestRate());
    }
}
