//находит наибольшую длину последовательности по возрастанию
package Array;
import java.util.Scanner;

public class array_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] arr = new int[len];
        arr[0] = scanner.nextInt();
        int last = arr[0];
        int lon = 1;
        int res = 1;
        for(int i = 1; i < len; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] >= last){
                if(i == len - 1){
                    lon = lon + 1;
                    break;
                }
                else {
                    last = arr[i];
                    lon++;
                }
            }
            else{
                if(lon > res) {
                    res = lon;
                    if(res >= len / 2){
                        break;
                    }
                }
                last = arr[i];
                lon = 1;
            }
        }
        if(lon > res) {
            res = lon;
        }
        System.out.println(res);
    }
}
