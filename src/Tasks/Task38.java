//удаление записей с одинаковыми именами
package Tasks;

import java.text.ParseException;
import java.util.*;

public class Task38 {
    public static Map<String, String> createMap() throws ParseException{
        Map<String, String> map = new HashMap<String, String>();
        map.put("Ивано", "Катя");
        map.put("Иванова", "Вика");
        map.put("Петров", "Вася");
        map.put("Ивлев", "Данил");
        map.put("Серова", "Вера");
        map.put("Гусева", "Катя");
        map.put("Яковлева", "Ира");
        map.put("Романов", "Роман");
        map.put("Сидоров", "Игорь");
        map.put("Павлов", "Максим");

        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> pair = new HashMap<>(map);
        for (String name : pair.values()) {
            int n = 0;
            for (String name2 : map.values()) {
                if (name2.equals(name)) {
                    n++;
                }
            }
            if (n > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair1 : copy.entrySet()) {
            if (pair1.getValue().equals(value)) {
                map.remove(pair1.getKey());
            }
        }
    }
    public static void main(String[] args) throws ParseException {
        Map<String, String> m1 = createMap();
        for (Map.Entry<String, String> pair2 : m1.entrySet()) {
            System.out.println(pair2.getKey() + " " + pair2.getValue());
        }
        System.out.println("***");
        removeTheFirstNameDuplicates(m1);
        for (Map.Entry<String, String> pair2 : m1.entrySet()) {
            System.out.println(pair2.getKey() + " " + pair2.getValue());
        }
    }
}
