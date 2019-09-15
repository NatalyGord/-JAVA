//дана последовательность чисел. если упорядоченая написать - true? если нет - false.
// 0 завершение последовательности
package Loop;
import java.util.Scanner;
public class Loop21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean b = true;
        if(num2 == 0){
            System.out.print(b);
        }
        else {
            if (num2 >= num) {
                while (num2 >= num) {
                    num = num2;
                    num2 = scanner.nextInt();
                    b = true;
                    if (num2 == 0) {
                        break;
                    }
                    if (num2 < num) {
                        b = false;
                        break;
                    }
                    num = num2;
                }
                System.out.print(b);
            } else {
                while (num2 <= num) {
                    num = num2;
                    num2 = scanner.nextInt();
                    b = true;
                    if (num2 == 0) {
                        break;
                    }
                    if (num2 > num) {
                        b = false;
                        break;
                    }
                    num = num2;
                }
                System.out.print(b);
            }
        }
    }
}
