import java.util.Scanner;

public class inclass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //race a car
        // convert to lowercase and remove non-alphanumeric character
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        //raceacar
        String rev = new StringBuilder(s).reverse().toString();
        //racaecar
        if (s.equals(rev)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
