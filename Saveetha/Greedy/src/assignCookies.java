import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] greed = {1,5,3,4,2};
        int cookies[] = {1,2,3,1};

        Arrays.sort(greed); // 1 2 3 4 5
        Arrays.sort(cookies); // 1 1 2 3
        int i = 0; // greed
        int j = 0; // cookies
        while (i < greed.length && j < cookies.length){
            if (cookies[j] >= greed[i]){
                i++;
            }
            j++;// cookies
        }
        System.out.println("Satisfies : " + i);
    }
}
