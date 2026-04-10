public class targetIndex {
    public static void indexCheck(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2};
        int target = 2;
        System.out.println("Indices : ");
        indexCheck(arr,target);
    }
}
