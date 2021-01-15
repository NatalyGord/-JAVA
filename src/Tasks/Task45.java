//вводим пары город - фамилия, затем по  введеному городу выводим кто там живет
package Tasks;

import java.io.*;
import java.util.*;

public class Task45 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>();
        while (true) {
            String s1 = reader.readLine();

            if (s1.isEmpty()) {
                break;
            }
            String s2 = reader.readLine();
            map.put(s1, s2);
        }

        // читаем название города
        String city = reader.readLine();
        for(Map.Entry<String, String> pair: map.entrySet()){
            if(pair.getKey().equals(city)){
                System.out.println(pair.getValue());
            }
        }
    }
}
