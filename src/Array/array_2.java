//проверяет по порядку ли массив
package Array;
import java.util.Scanner;
public class array_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = true;
        int len = scanner.nextInt();
        int[] arr = new int[len];
        arr[0] = scanner.nextInt();
        int last = arr[0];
        for(int i = 1; i < len; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] < last){
                res = false;
                break;
            }
            else{
                last = arr[i];
            }
        }
        System.out.println(res);
    }
}
