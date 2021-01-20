//Перевод даты из одного формата в другой
package Tasks;

import java.io.*;
import java.text.*;
import java.util.*;

public class Task50 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String time = reader.readLine();
//        LocalDate time2 = LocalDate.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(time2.format(DateTimeFormatter.ofPattern("MMM dd, yyyy", new Locale("EN"))));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date time = dateFormat.parse(reader.readLine());

        DateFormat dateFormat2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        String t2 = dateFormat2.format(time).toUpperCase();
        System.out.println(t2);

    }
}
