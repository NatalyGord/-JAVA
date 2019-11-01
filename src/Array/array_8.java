//сумма всех чисел в массиве
package Array;

import java.util.Scanner;

public class array_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int res = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
            res = res + arr[i];
        }
        System.out.println(res);
    }
}
