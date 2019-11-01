//проверка правильно ли указывается время
package different;
import java.util.Scanner;

public class diff_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.nextLine();

        String regex = "(1[0-9]|2[0-3]|0[0-9]):[0-5][0-9]";
        if (ip.matches(regex)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
