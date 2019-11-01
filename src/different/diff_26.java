package different;
import java.util.Scanner;

public class diff_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.nextLine();

        String regex = "(\\+?|-?)(0|0(\\.|,)0|0(\\.|,)[0-9]*[1-9]|[1-9]+(\\.|,)[0-9]*[1-9]|[1-9]+(\\.|,)0|[1-9][0-9]*)";
        if (ip.matches(regex)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
