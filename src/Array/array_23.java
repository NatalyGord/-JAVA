//заполняем симметричную матрицу от 0 до n
package Array;

import java.util.Scanner;

public class array_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                arr[i][j] = j - i;
                arr[j][i] = j - i;
            }

        }
        for(int b = 0; b < n; b++){
            for(int k = 0; k < n; k++){
                System.out.print(arr[k][b] + " ");
            }
            System.out.println();
        }
    }
}
