//проверяет стоят ли два числа подряд в массиве
package Array;
import java.util.Scanner;

public class array_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        boolean res = true;
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < len-1; i++) {
            if(arr[i] == n){
                if(arr[i + 1] == m){
                    res = false;
                    break;
                }
            }
            else {
                if (arr[i] == m) {
                    if (arr[i + 1] == n) {
                        res = false;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
