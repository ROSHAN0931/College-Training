import java.util.*;

abstract class book {
    protected String title;
    protected String author;

    book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class referencebook extends book {

    referencebook(String t, String a) {
        super(t, a);
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: In-library use only");
    }
}

class regularbook extends book {

    regularbook(String t, String a) {
        super(t, a);
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: Available for borrowing");
    }
}


class t73{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book type (1 for Reference, 2 for Regular):");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book title:");
        String title = sc.nextLine();

        System.out.println("Enter author name:");
        String author = sc.nextLine();

        book b;

        if (type == 1) {
            b = new referencebook(title, author);
        }
        else if (type == 2) {
            b = new regularbook(title, author);
        }
        else {
            System.out.println("Invalid book type.");
            return;
        }

        b.display();
    }
}