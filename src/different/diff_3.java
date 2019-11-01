//принемает слово и диапазон из 2х цифр. Вывести буквы в заданном диапазоне
package different;
import java.util.Scanner;
public class diff_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String world = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(world.substring(a, b + 1));
    }
}