//удаляем записи где д.р. летом
package Tasks;

import java.text.*;
import java.util.*;

public class Task37 {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("OCTOBER 6 2000"));
        map.put("Петров", dateFormat.parse("DECEMBER 31 1983"));
        map.put("Сидоров", dateFormat.parse("JULY 1 2012"));
        map.put("Гусев", dateFormat.parse("FEBRUARY 20 2002"));
        map.put("Белов", dateFormat.parse("DECEMBER 10 2012"));
        map.put("Черный", dateFormat.parse("DECEMBER 1 2015"));
        map.put("Зайцев", dateFormat.parse("JULY 1 2000"));
        map.put("Волк", dateFormat.parse("MAY 19 2005"));
        map.put("Бабушкин", dateFormat.parse("OCTOBER 15 2007"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> map1 = new HashMap<>(map);
        for (String k : map1.keySet()) {
            Date date = map1.get(k);
            int m = date.getMonth() + 1;
            if (m == 6 || m == 7 || m == 8) {
                map.remove(k);
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> m1 = createMap();
        for (Map.Entry<String, Date> pair : m1.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("***");
        removeAllSummerPeople(m1);

        for (Map.Entry<String, Date> pair : m1.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
