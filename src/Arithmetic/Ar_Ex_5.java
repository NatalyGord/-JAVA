//Выведите четное число после этого числа
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a + 2 - a%2;
        System.out.print(b);
    }
}
