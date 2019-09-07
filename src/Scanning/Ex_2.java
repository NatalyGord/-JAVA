//Напишите программу, которая читает пять слов из стандартного ввода
// и выводит каждое слово в новой строке.

package Scanning;
import java.util.Scanner;
public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        String s4 = scanner.next();
        String s5 = scanner.next();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        }
    }