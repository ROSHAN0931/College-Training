public class countElement {
    public static int appearence(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,3,2,2};
        int target = 2;
        System.out.println("Times : " + appearence(arr,target));
    }
}
