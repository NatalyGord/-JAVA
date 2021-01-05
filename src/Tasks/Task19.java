//добавление элементов в начало списка
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task19 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(0, reader.readLine());
        }
        for (String a : strings) {
                System.out.println(a);
        }
    }
}

