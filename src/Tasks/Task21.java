//вывод самой короткой или самой длинной строки из списка, той что первая будет
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task21 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = 0;
        int len2 = 0;
        String str;
        String res = "";
        for (int i = 0; i < 10; i++) {
            str = reader.readLine();
            strings.add(str);
            if (len < str.length()) {
                len = str.length();
            }
            if(i == 0){
                len2 = str.length();
            }
            if (len2 > str.length()) {
                len2 = str.length();
            }
        }
        for (String a : strings) {
            if ((len == a.length()) || (len2 == a.length())) {
                System.out.println(a);
                break;
            }
        }
    }
}
