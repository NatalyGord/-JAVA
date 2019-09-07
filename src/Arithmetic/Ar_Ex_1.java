//((n + 1) * n + 2) * n + 3
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(((n + 1) * n + 2) * n + 3);
    }
}