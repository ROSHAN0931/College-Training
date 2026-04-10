public class findString {
    public static boolean findTarget(String arr[],String target){
        for (String val : arr){
            if (val.equals(target)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"roshan","chennai","ooty"};
        String target = "ooty";
        System.out.println(findTarget(arr,target));
    }
}
