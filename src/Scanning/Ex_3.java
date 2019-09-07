//Напишите программу, которая читает две строки и два числа (в одной строке)
// и выводит их в том же порядке, каждая в новой строке.
package Scanning;
import java.util.Scanner;
public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int s3 = scanner.nextInt();
        int s4 = scanner.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
