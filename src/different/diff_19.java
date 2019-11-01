//проверка встречается ли заданное слово в строке в середине слова.
package different;
import java.util.*;
import java.util.regex.*;
public class diff_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w+" + part + "\\w+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        if(matcher.find()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
