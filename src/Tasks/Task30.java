//заполнение листа до слова end
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task30 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        while (true){
            String a = reader.readLine();
            if(a.equals("end")){
                break;
            }
            arr.add(a);
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

}
