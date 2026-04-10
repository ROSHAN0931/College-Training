import java.util.Scanner;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();//icecream
        char arr[] = str.toCharArray();//a,c,e,c,r,e,i,m
                                       //    i     j
        String vowels = "aeiouAEIOU";
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (vowels.indexOf(arr[i])==-1){
                i++;
            }
            else if (vowels.indexOf(arr[j])==-1){
                j--;
            }
            else {
                //swap
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }
}
