//дано количество символов в слове проверить есть ли в строке слова с таким количеством символов.
package different;
import java.util.*;
import java.util.regex.*;
public class diff_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{" + size + "}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

