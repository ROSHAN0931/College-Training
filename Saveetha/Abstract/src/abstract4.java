abstract class Employee{
    abstract int salary();
}

class fullTime extends Employee{
    int salary(){
        return 50000;
    }
}

class partTime extends Employee{
    int hours;
    partTime(int h){
        hours = h; // 10
    }
    int salary(){
        return hours * 500;
    }
}

public class abstract4 {
    public static void main(String[] args) {
        Employee e1 = new fullTime();
        Employee e2 = new partTime(7);
        System.out.println(e1.salary());
        System.out.println(e2.salary());
    }
}
