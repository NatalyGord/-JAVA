//находит все слова в которых есть часть "program" выводит индекс начала слова и само слово в котором есть
package different;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class diff_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w*program\\w*",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

