//проверка правильности решения судоку
package Array;

import java.util.Scanner;
import java.util.Arrays;

public class array_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = "NO";
        int[][] arr = new int[n*n][n*n];
        for (int j = 0; j < n * n; j++) {
            for (int i = 0; i < n * n; i++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("norm");
        int [] norm = new int[n*n];          //массив для сравнения
        for(int i = 1; i <= n*n; i++){
            norm[i - 1] = i;
            System.out.print(norm[i-1] + " ");
        }

        System.out.println();
        System.out.println("сравнение столбцов");
        int[] ar1 = new int[n*n];
        for(int j = 0; j < n*n; j++) {
            for (int i = 0; i < n * n; i++) {
                ar1[i] = arr[j][i];               //массив из первого столбца
                System.out.print(ar1[i] + " ");
            }
            Arrays.sort(ar1);
            //сравнение массивов
            if (Arrays.equals(norm, ar1)) {
                System.out.println("YES");
                res = "YES";
            } else {
                System.out.println("NO");
                res = "NO";
                break;
            }
        }
        System.out.println(res);

        System.out.println();
        System.out.println("сравнение строк");
        int[] ar2 = new int[n*n];
        for(int j = 0; j < n*n; j++) {
            for (int i = 0; i < n * n; i++) {
                ar2[i] = arr[i][j];               //массив из первой строки
                System.out.print(ar2[i] + " ");
            }
            Arrays.sort(ar2);
            //сравнение массивов
            if (Arrays.equals(norm, ar2)) {
                System.out.println("YES");
                res = "YES";
            } else {
                System.out.println("NO");
                res = "NO";
                break;
            }
        }
        System.out.println(res);
        System.out.println();
        int a = 0;

        int [] ar3 = new int[n*n];              //просмотр квадратов


        for(int k = 0; k < n; k++) {
            int c = 0;
            int b = a;
            for (int i = a; i < n + b; i++) {
                for (int j = 0; j < n; j++) {
                    ar3[c] = arr[j][i];
                    System.out.print(ar3[c] + " ");
                    c++;
                }
                a++;
            }
            Arrays.sort(ar3);
            //сравнение массивов
            if (Arrays.equals(norm, ar3)) {
                System.out.println("YES");
                res = "YES";
            } else {
                System.out.println("NO");
                res = "NO";
                //break;
            }
        }
        System.out.println();
        System.out.println(a + "a");
        //System.out.println(b + "b");
    }
}
