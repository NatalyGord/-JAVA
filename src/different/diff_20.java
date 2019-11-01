//проверка ip адреса
package different;
import java.util.Scanner;

public class diff_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.nextLine();

        String regex = "(1\\d?\\d?|21\\d?|22\\d?|23\\d?|24\\d?|25[0-5]?|\\d\\d?)\\.(1\\d?\\d?|21\\d?|22\\d?|23\\d?|24\\d?|25[0-5]?|\\d\\d?)\\.(1\\d?\\d?|21\\d?|22\\d?|23\\d?|24\\d?|25[0-5]?|\\d\\d?)\\.(1\\d?\\d?|21\\d?|22\\d?|23\\d?|24\\d?|25[0-5]?|\\d\\d?)";

        if (ip.matches(regex)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

