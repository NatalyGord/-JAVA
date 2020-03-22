//дана матрица n на m надо поменять местами столбцы с данными индексами
package Array;

import java.util.Scanner;

public class array_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                arr[j][i] = scanner.nextInt();
            }
        }
        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        int [] ar2 = new int[n];
        for(int i = 0; i < n; i++){
            ar2[i] = arr[i][col2];
        }
        for(int i = 0; i < n; i++){
            arr[i][col2] = arr[i][col1];
        }
        for(int i = 0; i < n; i++){
            arr[i][col1] = ar2[i];
        }

        System.out.println();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
