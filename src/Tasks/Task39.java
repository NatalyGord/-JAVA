//удалить людей с з.п. ниже 500
package Tasks;

import java.util.*;

public class Task39 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ивано", 200);
        map.put("Иванова", 500);
        map.put("Петров", 800);
        map.put("Ивлев", 1000);
        map.put("Серова", 300);
        map.put("Гусева", 1100);
        map.put("Яковлева", 1700);
        map.put("Романов", 2000);
        map.put("Сидоров", 2100);
        map.put("Павлов", 900);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> map1 = new HashMap<>(map);
        for (Map.Entry<String, Integer> p : map1.entrySet()) {
            if (p.getValue() < 500) {
                map.remove(p.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> m1 = createMap();
        for (Map.Entry<String, Integer> p : m1.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }
        removeItemFromMap(m1);
        System.out.println("***");
        for (Map.Entry<String, Integer> p : m1.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

    }
}
