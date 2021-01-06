//удаление элемента и обратная печать списка
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task23 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        strings.remove(2);
        for (int i = 3; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}
