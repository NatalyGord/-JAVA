//читает трехзначное число, меняет 1 и 3 цифру местами и выводит
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num/100;
        int num2 = (num - num1*100)/10;
        int num3 = num%10;
        System.out.print(num3 + "" + num2 + "" + num1);
    }
}