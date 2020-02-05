//найти индексы первого максимального числа в массиве дано n строк, m целых чисел в строке и сами числа(не больше 100).
package Array;
import java.util.Scanner;

public class array_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int num;
        int a = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        int[][] arr = new int[n][m];
        int res = -2147483648;
        for(j = 0; j < n; j++) {
            for (i = 0; i < m; i++) {
                num = scanner.nextInt();
                arr[j][i] = num;
                if (num > res) {
                    res = num;
                    a = j;
                    b = i;
                }
            }
        }
    System.out.println(a + " " + b);
    }
}
