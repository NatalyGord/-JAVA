//проверка симетрична ли матрица относительно главной диагонали
package Array;

import java.util.Scanner;

public class array_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = "NO";
        int arr[][] = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
                //System.out.print(arr[i][j]);
            }
            //System.out.println();
        }
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                if(arr[j][i] == arr[i][j]){
                    res = "YES";
                }
                else{
                    res = "NO";
                    j = n;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
