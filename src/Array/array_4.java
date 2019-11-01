//дано колво элем в массиве, массив, число. найти сумму элементов массива которые больше n
package Array;

import java.util.Scanner;

public class array_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int res = 0;
        for(Integer num: arr) {
            if (num > n) {
                res = res + num;
            }
        }
        System.out.println(res);
    }
}
