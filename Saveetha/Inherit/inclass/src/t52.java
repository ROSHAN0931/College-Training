import java.util.Scanner;

class Student {
    String name;
    int id;
    String department;

    Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

class GraduateStudent extends Student {
    String thesisTopic;

    GraduateStudent(String name, int id, String department, String thesisTopic) {
        super(name, id, department); // call parent constructor
        this.thesisTopic = thesisTopic;
    }

    public void displayThesisTopic() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class t52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name:");
        String name = sc.nextLine();

        System.out.println("Enter the student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the student's department:");
        String department = sc.nextLine();

        System.out.println("Enter the thesis topic:");
        String thesisTopic = sc.nextLine();

        GraduateStudent gs = new GraduateStudent(name, id, department, thesisTopic);

        gs.displayStudentInfo();
        gs.displayThesisTopic();
    }
}