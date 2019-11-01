//проверяет пароль на надежность 1цифра, 1 заглавная и одна строчная буква, не менее 12символов.
package different;
import java.util.Scanner;
public class diff_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.matches("\\s*\\w*[0-9]\\w*\\s*") && pass.matches("\\s*\\w*[a-z]\\w*\\s*") && pass.matches("\\s*\\w*[A-Z]\\w*\\s*") && pass.matches("\\w{12,}")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
