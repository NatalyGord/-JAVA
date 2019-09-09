//n количество чисел затем сами числа даны
//найти сумму чисел /6
package Loop;
import java.util.Scanner;
public class Loop9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if(num % 6 == 0){
                sum = sum + num;
            }
        }
        System.out.print(sum);
    }
}