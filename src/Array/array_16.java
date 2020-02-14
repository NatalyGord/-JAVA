//повернуть матрицу на 90 гр вправо
package Array;
import java.util.Scanner;

public class array_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int j = 0;
        int [][] arr = new int[m][n];
        for(j = 1; j <= n; j++){
            for(i = 0; i < m; i++){
                int b = scanner.nextInt();
                arr[i][n - j] = b;
            }
        }
        System.out.println();
        for(i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


