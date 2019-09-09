//среднее арифметическое всех цифр /3 в диапазоне от a до b
package Loop;
import java.util.Scanner;
public class Loop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 0;
        int k = 0;
        double sum = 0;
        for(i = a; i <= b; i++) {
            if(i % 3 == 0){
                k++;
                sum = sum + i;
            }
        }
        System.out.println(sum / k);
    }
}