// вывод имени и фамилии через пробел
package different;
import java.util.Scanner;
public class diff_10 {

    public static String prepareFullName(String firstName, String lastName) {
        if(firstName == null){
            if(lastName != null) {
                return lastName;
            }
            else{
                return "error";
            }
        }
        else{
            if(lastName == null){
                if(firstName != null) {
                    return firstName;
                }
                else{
                    return "error";
                }
            }
        }
        return firstName + " " + lastName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}