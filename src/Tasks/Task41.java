//делаем каждое слово во введеной строке с большой буквы
package Tasks;

import java.io.*;
import java.util.*;

public class Task41 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[] str = (scanner.nextLine()).toCharArray();

        str[0] = Character.toUpperCase(str[0]);
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == ' ') {
                str[i + 1] = Character.toUpperCase(str[i + 1]);
            }
        }
        String string = new String(str);
        System.out.println(string);
    }
}
