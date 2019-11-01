//найти сколько троек (три числа подряд по возрастанию) есть в массиве
package different;
import java.util.Scanner;
public class diff_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }
        if(len > 2) {
            int a = array[0];
            int b = array[1];
            int res = 0;
            for (int i = 2; i < len; i++) {
                int c = array[i];
                if (b == a + 1 && c == b + 1) {
                    res = res + 1;
                }
                a = b;
                b = c;
            }
            System.out.println(res);
        }
        else{
            System.out.println(0);
        }
    }
}