//количество цифр делящихся на n в диапазоне от a до b
package Loop;
import java.util.Scanner;
public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        int k = 0;
        for(i = a; i <= b; i++) {
            if(i % n == 0){
               k++;
            }
        }
        System.out.println(k);
    }
}

