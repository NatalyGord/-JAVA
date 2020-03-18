//снежинка из двумерного массива
package Array;
import java.util.Scanner;
public class array_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                arr[i][j] = ".";
            }
        }
        for (int j = 0; j < n; j++) {
            arr[n / 2][j] = "*";
            arr[j][n / 2] = "*";
            arr[j][j] = "*";
            arr[j][n - 1 - j] = "*";
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
}
