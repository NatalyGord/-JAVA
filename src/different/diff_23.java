//находит числа более 10 знаков, выводит их и количество знаков
package different;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class diff_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithNumbers = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d{10,}\\b");
        Matcher matcher = pattern.matcher(stringWithNumbers);

        while(matcher.find()) {
            int size = matcher.end() - matcher.start();
            System.out.println(matcher.group() + ":" + size);
        }
    }
}

