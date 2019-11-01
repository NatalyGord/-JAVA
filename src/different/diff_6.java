//найти минимальное число в массиве.
package different;
import java.util.Scanner;
public class diff_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
            System.out.println(array[i]);
        }
        int res = array[0];
        for(int ar: array){
            if(res > ar){
                res = ar;
            }
        }
        System.out.println(res);
    }
}






