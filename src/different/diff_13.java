//дано два double числа первое / второе. Если  равно +бескон выводим Integer.MAX_VALUE, если -беск Integer.MIN_VALUE
//иначе выводим результат в int
package different;
import java.util.*;
public class diff_13 {

    private static int convert(Double val) {
        if (val.isNaN()) {
            return 0;
        } else {
            if (val == Double.POSITIVE_INFINITY) {
                return Integer.MAX_VALUE;
            } else {
                if (val == Double.NEGATIVE_INFINITY) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        int i = 1;
        boolean a = true;
        while (a) {
            if (val < i) {
                return i - 1;
            } else {
                i++;
            }
        }
        return i;
    }

        /* Do not change code below */
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            Double doubleVal = scanner.nextDouble() / scanner.nextDouble();
            System.out.println(convert(doubleVal));
        }

}

