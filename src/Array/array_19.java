//проверка правильности решения судоку
package Array;

import java.util.Scanner;
import java.util.Arrays;

public class array_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = "NO";
        int[][] arr = new int[n * n][n * n];
        for (int j = 0; j < n * n; j++) {
            for (int i = 0; i < n * n; i++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int [] norm = new int[n * n];          //массив для сравнения
        for(int i = 1; i <= n*n; i++){
            norm[i - 1] = i;
        }
        boolean ans = true;
        while(ans) {
            int[] ar1 = new int[n * n];
            for (int j = 0; j < n * n; j++) {

                for (int i = 0; i < n * n; i++) {
                    ar1[i] = arr[j][i];               //массив из первого столбца
                }
                Arrays.sort(ar1);
                //сравнение массивов
                if (Arrays.equals(norm, ar1)) {
                    res = "YES";

                } else {
                    res = "NO";
                    ans = false;
                    break;
                }
            }
            if(ans) {
                int[] ar2 = new int[n * n];
                for (int j = 0; j < n * n; j++) {
                    for (int i = 0; i < n * n; i++) {
                        ar2[i] = arr[i][j];               //массив из первой строки
                    }
                    Arrays.sort(ar2);
                    //сравнение массивов
                    if (Arrays.equals(norm, ar2)) {
                        res = "YES";
                    } else {
                        res = "NO";
                        ans = false;
                        break;
                    }
                }
                if(ans) {
                    int v = 0;
                    int[] ar3 = new int[n * n];              //просмотр квадратов
                    for (int g = 0; g < n; g++) {
                        int a = 0;
                        int num = v;
                        for (int k = 0; k < n; k++) {
                            int c = 0;
                            int b = a;
                            for (int i = a; i < n + b; i++) {
                                for (int j = num; j < n + num; j++) {
                                    ar3[c] = arr[j][i];
                                    c++;
                                }
                                a++;
                            }
                            v++;
                            Arrays.sort(ar3);
                            //сравнение массивов
                            if (Arrays.equals(norm, ar3)) {
                                res = "YES";
                            } else {
                                res = "NO";
                                ans = false;
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        System.out.println(res);
    }
}
