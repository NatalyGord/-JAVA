//подсчет количества дней с начала года (если нечетное выводим true, иначе false)
package Tasks;

import java.util.*;

public class Task43 {
    public static void main(String[] args) {
        //System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 10 2013"));
    }

    public static boolean isDateOdd(String date) {
       // DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Date end = new Date(date);  //дата, которая дана
        int year = end.getYear();  // получаем год

        Date st = new Date(); //устанавливаем дату 01.01.нужного года
        st.setYear(year);
        st.setMonth(0);
        st.setDate(1);
        st.setHours(0);
        st.setMinutes(0);
        st.setSeconds(0);

        long del = end.getTime() - st.getTime();
        long dn = del/(60*60*24*1000);
        return ((dn % 2 == 0)? false : true);
    }
}
