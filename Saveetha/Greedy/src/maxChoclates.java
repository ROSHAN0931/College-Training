import java.util.Arrays;

public class maxChoclates {
    public static void main(String[] args) {
        int prices[] = {1,2,3,4};
        int money = 10;
        int count = 0;

        Arrays.sort(prices);
        for (int p : prices){
            if (money >= p){
                money = money - p;
                count++;
            }
        }
        System.out.println("Choclates : " + count);
    }
}
