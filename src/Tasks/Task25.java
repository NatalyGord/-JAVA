//удваиваем значения
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task25 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String a : result) {
            System.out.println(a);
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            list.add(i, a);
            i++;
        }
        return list;
    }
}
