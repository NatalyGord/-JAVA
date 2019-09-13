//считывает цифры до 0 затем завершается и выводит количество чисел прочитаных до 0
package Loop;
import java.util.Scanner;
public class Loop12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int a;
        do {
            a = scanner.nextInt();
            n++;
        }
        while (a > 0);
        System.out.print(n - 1);
    }
}
