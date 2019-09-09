//a, b, c, d . Выведите в порядке возрастания все целые числа от 0 до 1000,
// которые являются корнями уравнения
// ах ^ 3 + Ьх ^ 2 + cх + d = 0
package Loop;
import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for(int x = 0; x <= 1000; x++){
            if(a * x * x * x + b * x * x + c * x + d == 0){
                System.out.println(x);
            }
        }
    }
}