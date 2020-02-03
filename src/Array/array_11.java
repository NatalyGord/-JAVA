//числа по спирали от 1 до n*n
package Array;
import java.util.Scanner;

public class array_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        int x1 = 0;
        int x2 = n - 1;
        int y1 = 0;
        int y2 = n - 1;
        int num = 1;
        int i;
        while(num <= n * n){
            for(i = x1; i <= x2; i++){
                arr[y1][i] = num;
                num++;
            }
            for(i = y1 + 1; i <= y2; i++){
                arr[i][x2] = num;
                num++;
            }
            for(i = x2 - 1; i >= x1; i--){
                arr[y2][i] = num;
                num++;
            }
            for(i = y2 - 1; i >= y1 + 1; i--){
                arr[i][x1] = num;
                num++;
            }
        x1++;
        x2--;
        y1++;
        y2--;
        }

        for(int j = 0; j < n; j++) {
            for (i = 0; i < n; i++) {

                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
