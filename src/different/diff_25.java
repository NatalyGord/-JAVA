package different;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class diff_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?is)password\\s*:*\\s*[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String text2 = matcher.group();
            Pattern pattern2 = Pattern.compile("\\W[a-zA-Z0-9]*\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher2 = pattern2.matcher(text2);
            if (matcher2.find()) {
                String text3 = matcher2.group();
                Pattern pattern3 = Pattern.compile("\\b[a-zA-Z0-9]+", Pattern.CASE_INSENSITIVE);
                Matcher matcher3 = pattern3.matcher(text3);
                if (matcher3.find()) {
                    System.out.println(matcher3.group());
                }
            }
        }
        Pattern pattern4 = Pattern.compile("(?is)password");
        Matcher matcher4 = pattern4.matcher(text);
        if (!matcher4.find()) {
            System.out.println("No passwords found.");
        }
    }
}

