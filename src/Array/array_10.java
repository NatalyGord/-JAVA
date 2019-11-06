//находит индекс первого максимума в массиве
package Array;
import java.util.Scanner;

public class array_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        arr[0] = scanner.nextInt();
        int max = arr[0];
        int res = 0;
        for (int i = 1; i < len; i++) {
            arr[i] = scanner.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (Integer num: arr) {
            if(num == max){
                break;
            }
            else{
                res++;
            }
        }
        System.out.println(res);
    }
}
