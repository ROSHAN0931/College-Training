import java.util.Scanner;

abstract class LibraryCard {
    protected String memberDetails;

    LibraryCard(String memberDetails) {
        this.memberDetails = memberDetails;
    }

    public String getMemberDetails() {
        return memberDetails;
    }

    abstract void displayDetails(int minBooks);
}

class MembershipCard extends LibraryCard {

    MembershipCard(String memberDetails) {
        super(memberDetails);
    }

    void displayDetails(int minBooks) {
        String[] parts = memberDetails.split("\\|");

        String name = parts[0].trim();
        String cardNumber = parts[1].trim();

        System.out.println(name + "'s Membership Card Details");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Minimum books to borrow: " + minBooks);
        System.out.println("Due date to return the book: 10 days from the book taken");
    }
}

class LifeLongMembershipCard extends LibraryCard {

    LifeLongMembershipCard(String memberDetails) {
        super(memberDetails);
    }

    void displayDetails(int minBooks) {
        String[] parts = memberDetails.split("\\|");

        String name = parts[0].trim();
        String cardNumber = parts[1].trim();

        System.out.println(name + "'s Membership Card Details");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Minimum books to borrow: " + minBooks);
        System.out.println("Due date to return the book: unlimited");
    }
}

public class t82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here comes a choice to view");
        System.out.println("1. Lifelong Membership Card");
        System.out.println("2. Membership Card");

        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter member details in format: Name | CardNumber | ExpiryDate");
        String details = sc.nextLine();

        System.out.println("Enter the minimum number of books to borrow:");
        int minBooks = sc.nextInt();

        if (choice == 1) {
            LibraryCard card = new LifeLongMembershipCard(details);
            card.displayDetails(minBooks);

        } else if (choice == 2) {
            LibraryCard card = new MembershipCard(details);
            card.displayDetails(minBooks);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}