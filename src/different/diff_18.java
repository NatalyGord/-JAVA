//проверка регулярным выражением не должно начинаться с цифры, не м.б. _ одно подч и все, не м.б. два подчерк вместе
package different;
import java.util.Scanner;
public class diff_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        String regex = "\\s*_?[a-zA-Z]+\\w*\\s*";

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}

