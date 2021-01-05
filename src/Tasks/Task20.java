//удаление и добавление в списки
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task20 {

    public static void main(String[] args) throws IOException{
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        for(int i = 0; i < 13; i++){
            String a = strings.get(4);
            strings.remove(4);
            strings.add(0, a);
        }
        for (String a : strings) {
            System.out.println(a);
        }
    }
}
