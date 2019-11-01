//дано количество элементов массива, сами элементы, вывести элементы со сдвигом на 1.
package different;
import java.util.Scanner;
public class diff_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }
        int [] array2 = new int[len];
        array2[0] = array[len -1];
        System.out.print(array2[0] + " ");
        for(int i = 1; i < len; i++){
            array2[i] = array[i - 1];
            System.out.print(array2[i] + " ");
        }
    }
}
