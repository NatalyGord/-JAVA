//ввод названия месяца словом вывод месяца числом
package Tasks;

import java.io.*;
import java.util.*;

public class Task44 {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        String month = reader.readLine();
        int i = 1;
        for(String a: months){
            if(a.equals(month)){
                System.out.println(a + " is the " + i + " month");
                break;
            }
            i++;
        }
    }
}
