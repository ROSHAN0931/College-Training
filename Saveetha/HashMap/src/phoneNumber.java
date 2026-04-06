import java.util.HashMap;
import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of entries : ");
        int n = in.nextInt(); // 2
        for (int i=0;i<n;i++){
            String name = in.next();
            int num = in.nextInt();
            map.put(name,num);
        }
        String search = in.next(); // Rajesh
        if(map.containsKey(search)){
            System.out.println("Ph number : " + map.get(search));
        }
        else {
            System.out.println("Person not found");
        }
    }
}
