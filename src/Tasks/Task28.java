//перестановка элементов (массив из n строк, затем первые m переносим в конец)
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(reader.readLine());
        }
        int k = 0;
       while (k < m){
            arr.add(n, arr.get(0));
            arr.remove(0);
            k++;
        }
        for (String a : arr) {
            System.out.println(a);
        }
    }
}
