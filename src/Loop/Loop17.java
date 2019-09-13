//дано длинное число m. Найти наименьшее число n чтоб (n! > m) !факториал
package Loop;
import java.util.Scanner;
public class Loop17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        long k = 1;
        while (k < m){
            n++;
            k = k * n;
        }
        System.out.println(n);
    }
}
