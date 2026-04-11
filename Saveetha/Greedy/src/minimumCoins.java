public class minimumCoins {
    public static void main(String[] args) {
        int[] coins = {50,20,10,5,2,1};
        int amount = 93;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]){
                System.out.print(coins[i] + " ");//50 20 20 2 1
                amount = amount - coins[i];// 0
                count++; // 5
            }
        }
        System.out.println("\nCoins count : " + count);
    }
}