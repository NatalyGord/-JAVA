//Напишите программу, которая считывает два целых числа из стандартного ввода
// и выводит их в обратном порядке, разделенных одним пробелом.
package Scanning;
import java.util.Scanner;
public class Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print(num2 + " " + num1);
    }
}