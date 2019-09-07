//Напишите программу, которая читает три строки и выводит их в обратном порядке, каждая в новой строке
package Scanning;
import java.util.Scanner;

class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);
    }
}