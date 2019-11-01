//сравнить окончание слов (например Brandenburg, Saint Petersburg ...)
package different;
import java.util.Scanner;
public class diff_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String world = scanner.nextLine();
        int n = world.length();
        if(n >= 4) {
            String world2 = world.substring(n - 4, n);
            System.out.println(world2.equalsIgnoreCase("burg"));
        }
        else{
            System.out.println("false");
        }
    }
}

// System.out.println(new Scanner(System.in).nextLine().endsWith("burg"));