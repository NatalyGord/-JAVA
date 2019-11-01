//сравнить строки не учитывая пробелы
package different;
import java.util.Scanner;
public class diff_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String world = scanner.nextLine().replace(" ", "");
        String world2 = scanner.nextLine().replace(" ", "");
        System.out.println(world.equals(world2));
    }
}