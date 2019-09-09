//сумма всех цифр в диапазоне от a до b(включая)
package Loop;
import java.util.Scanner;
public class Loop11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = 0;
        for(int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}