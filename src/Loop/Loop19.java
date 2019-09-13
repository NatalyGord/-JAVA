//найти сумму всех элементов последовательности до 0
package Loop;
import java.util.Scanner;
public class Loop19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while(a != 0){
            a = scanner.nextInt();
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
