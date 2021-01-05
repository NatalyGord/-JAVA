//вывод на экран самых длинных строк из списка
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task17 {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws IOException {
        //ArrayList<String> strings = new ArrayList<>();
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = 0;
        String str;
        String res = "";
        for(int i = 0; i < 5; i++) {
            str = reader.readLine();
            strings.add(str);
            if(len < str.length()){
                len = str.length();
            }
        }
        for(String a: strings) {
            if (len == a.length()) {
                System.out.println(a);
            }
        }
    }
}
