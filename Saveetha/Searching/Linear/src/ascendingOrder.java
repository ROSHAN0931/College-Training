public class ascendingOrder {
    public static boolean orderCheck(int arr[]){
        int temp = 1;
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i+1]){
                    temp=1;
                }
                else {
                    temp = 0;
                    break;
                }
        }
        if (temp==1){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(orderCheck(arr));
    }
}
