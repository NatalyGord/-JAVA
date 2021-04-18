//запись в файл с консоли до тех пор пока не ввели "exit"
package Tasks;

import java.io.*;

public class Task57 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String failName = reader.readLine(); //читаем имя файла

        String data;
        File file = new File(failName);
        FileWriter fr = null;
        BufferedWriter br = null;

        fr = new FileWriter(file);
        br = new BufferedWriter(fr);
        while (true) {
            data = reader.readLine();  //читаем данные
            String dataW = data + System.getProperty("line.separator");
            br.write(dataW);  //запись
            if (data.equals("exit")) {
                break;
            }
        }
        br.close();
        fr.close();
    }
}
