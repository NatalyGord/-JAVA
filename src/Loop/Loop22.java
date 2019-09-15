//дана последовательность чисел 0-прекращение вывод суммы чисел
//если сумма превышает 1000 то оттановка и вывод суммы минус 1000
package Loop;
import java.util.Scanner;
public class Loop22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if(sum >= 1000){
            System.out.print(sum - 1000);
        }
        else {
            while (sum != 0) {
                int num2 = scanner.nextInt();
                if (num2 != 0) {
                    sum += num2;
                    if (sum >= 1000) {
                        System.out.print(sum - 1000);
                        break;
                    }
                } else {
                    if (sum >= 1000) {
                        System.out.print(sum - 1000);
                        break;
                    } else {
                        System.out.print(sum);
                        break;
                    }
                }
            }
        }
    }
}

/*      int input;
        int sum = 0;

        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);*/