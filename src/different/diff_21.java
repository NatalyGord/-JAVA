//проверка встречается ли заданное слово в строке в начале или конце слова.
package different;
import java.util.*;
import java.util.regex.*;
public class diff_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b" + part + "[a-zA-Z]*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        Pattern pattern1 = Pattern.compile("[a-zA-Z]*" + part + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(line);

        if (matcher.find()) {
            System.out.println("YES");
        } else {
            if(matcher1.find()){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
