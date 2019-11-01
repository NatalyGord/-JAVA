//даны элементы, вывести элементы со сдвигом на n.
package different;
import java.util.Scanner;
import java.util.Arrays;

public class diff_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();   //"11 34 3 45 23 5 67";
        int[] array = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray(); //Это для перевода строки String в Int массив
        int len = array.length;

        int n = scanner.nextInt();
        if (n > len){
            n = n % len;
        }
        int [] array2 = new int[len];
        for(int j = 0; j < n; j++){
            array2[j] = array[len - n + j];
            System.out.print(array2[j] + " ");
        }

        for(int i = n; i < len; i++){
            array2[i] = array[i - n];
            System.out.print(array2[i] + " ");
        }
        //System.out.println(Arrays.toString(array2));
    }
}