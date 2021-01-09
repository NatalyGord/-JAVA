//слова с четным количеством символов удваиваются, с нечетным утраиваются
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task31 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) {
                break;
            }
            strings.add(string);
        }
        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string;
            if((strings.get(i).length()) % 2 == 0) {
                string = strings.get(i) + " " + strings.get(i);
            }
            else {
                string = strings.get(i) + " " + strings.get(i) + " " + strings.get(i);
            }
            resultStrings.add(string);
        }
        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
