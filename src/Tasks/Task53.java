//подсчет сколько каких буков во введеных строчках
package Tasks;

import java.io.*;
import java.util.*;

public class Task53 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        ArrayList<Character> ch = new ArrayList<>();
        for(String a: list){
            char[] c = a.toCharArray();
            for(Character b: c) {
                ch.add(b);
            }
        }
        for (int i = 0; i < 33; i++){
            int n = 0;
            for (char c: ch){
                if(alphabet.get(i) == c){
                    n++;
                }
            }
            System.out.println(alphabet.get(i) + " " + n);
        }
    }
}
