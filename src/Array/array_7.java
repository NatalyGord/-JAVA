//проверяет стоят ли рядом в массиве n и m
package Array;
import java.util.Scanner;
public class array_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        boolean res = false;
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0; i < len; i++){
            if(arr[i] == n){
                if(i == len - 1){
                    res = false;
                }
                else{
                    if(arr[i + 1] == m){
                        res = true;
                        break;
                    }
                }
            }
            else{
                if(i == len - 1){
                    res = false;
                }
                else {
                    if (arr[i] == m) {
                        if (arr[i + 1] == n) {
                            res = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
