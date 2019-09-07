//Напишите программу, которая читает четыре целых
// числа из одной строки и печатает их каждое в новой строке.

package Scanning;
import java.util.Scanner;
public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
