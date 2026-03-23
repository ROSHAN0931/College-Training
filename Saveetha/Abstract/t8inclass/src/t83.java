import java.util.*;

abstract class book {
    protected String title;
    protected String author;
    protected int year;

    book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displaybookinfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + year);
    }

    abstract void show();
}


class available extends book {

    available(String t, String a, int y) {
        super(t, a, y);
    }

    void show() {
        System.out.println("Status: The book is available.");
    }
}

class reserved extends book {

    reserved(String t, String a, int y) {
        super(t, a, y);
    }

    void show() {
        System.out.println("Status: The book is reserved.");
    }
}


class borrowed extends book {

    borrowed(String t, String a, int y) {
        super(t, a, y);
    }

    void show() {
        System.out.println("Status: The book is borrowed.");
    }
}

class t83 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book title:");
        String title = sc.nextLine();

        System.out.println("Enter the author:");
        String author = sc.nextLine();

        System.out.println("Enter the year of publication:");
        int year = sc.nextInt();

        System.out.println("Select book status:");
        System.out.println("1. Available");
        System.out.println("2. Reserved");
        System.out.println("3. Borrowed");

        int choice = sc.nextInt();

        book b;

        if (choice == 1) {
            b = new available(title, author, year);
        }
        else if (choice == 2) {
            b = new reserved(title, author, year);
        }
        else if (choice == 3) {
            b = new borrowed(title, author, year);
        }
        else {
            System.out.println("Invalid choice.");
            return;
        }

        b.displaybookinfo();
        b.show();
    }
}