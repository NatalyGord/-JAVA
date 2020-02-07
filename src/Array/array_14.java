// если есть матрица 2 на 2 с одинаковыми символвми то "NO"
package Array;

import java.util.Scanner;

public class array_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        String s;
        String res = "YES";
        char [][] arr = new char[4][4];
        for(i = 0; i < 4; i++){
            String a = scanner.nextLine();
            for(j = 0; j < 4; j++){
                arr [i][j] = a.charAt(j);
            }
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(arr[i][j] == arr [i][j + 1] && arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i + 1][j + 1]){
                    res = "NO";
                }
            }
        }
        System.out.println(res);
    }
}
