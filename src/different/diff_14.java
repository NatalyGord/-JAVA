//дано длина массива, массив, число. найти сколько раз число повторяется в массиве.
package different;
import java.util.Scanner;
import java.util.Arrays;

public class diff_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(array));
        int num = scanner.nextInt();
        int i = 0;
        for(int a : array){
            if(a == num){
                i++;
            }
        }
        System.out.println(i);
    }
}
