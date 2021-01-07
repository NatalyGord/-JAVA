//выводим первое слово нарушающее последовательность по возростанию длины слов
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task26 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size() - 1; i++){
            if((list.get(i + 1)).length() < (list.get(i)).length()){
                System.out.println(list.get(i + 1) + " индекс " + (i+1));
                break;
            }
        }
    }
}
