//вывод на экран самых коротких строк из списка
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task18 {

    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int len = str.length();
        strings.add(str);
        String res = "";
        for (int i = 1; i < 5; i++) {
            str = reader.readLine();
            strings.add(str);
            if (len > str.length()) {
                len = str.length();
            }
        }
        for (String a : strings) {
            if (len == a.length()) {
                System.out.println(a);
            }
        }
    }
}


