import java.util.Scanner;

public class l59spiralmatrix {
    public static int[][] generateMatrix(int n){
        int a[][] = new int[n][n];
        int rowstart = 0;
        int rowend = n-1;
        int colstart = 0;
        int colend = n-1;
        int num = 1;
        while (rowstart<=rowend && colstart<=colend){
            //left to right
            for (int i=colstart;i<=colend;i++){
                a[rowstart][i] = num++;
            }
            rowstart++;

            //top to bottom
            for (int i = rowstart; i <=rowend ; i++) {
                a[i][colend] = num++;
            }
            colend--;

            //right to left
            for (int i = colend; i >= colstart ; i--) {
                a[rowend][i] = num++;
            }
            rowend--;

            //bottom to top
            for (int i = rowend; i >= rowstart ; i--) {
                a[i][colstart] = num++;
            }
            colstart++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res[][] = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
