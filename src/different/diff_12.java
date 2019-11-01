//дано кол-во элем в массиве, сам массив.
// Найти наиботьшее попарное произведение последовательных элементов массива
package different;
import java.util.Scanner;
import java.util.Arrays;

public class diff_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
       // System.out.println(Arrays.toString(array));
        int ans = 0;
        if(len < 2) {
            System.out.println(array[0]);
        }
        else{
            for(int i = 1; i < len; i++){
                int res = array[i - 1] * array[i];
                if(res > ans) {
                    ans = res;
                }
            }
            System.out.println(ans);
        }
    }
}