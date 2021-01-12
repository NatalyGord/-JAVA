package Tasks;

import java.util.*;

public class Task36 {

    public static Map<String, String> createMap() {
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        String str = name;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        String str = lastName;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
            System.out.println("0-" + pair.getKey());
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> m1 = createMap();
        //System.out.println(getCountTheSameLastName(m1, "Иванова"));
        System.out.println(getCountTheSameFirstName(m1, "Катя"));
    }
}
