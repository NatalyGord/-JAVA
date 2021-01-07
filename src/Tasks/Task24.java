//удаляем из списка слова содержащие р, удваиваем слова содержащие л, если есть и р и л - оставляем без изменения
package Tasks;

import java.util.ArrayList;

public class Task24 {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);
        for (String a : strings){
            System.out.println(a);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            String a = strings.get(i);
            if(a.contains("р") || a.contains("л")){
                if(a.contains("р") && a.contains("л")){
                    continue;
                }
                if(a.contains("р")) {
                    strings.remove(i);
                    i--;
                }
                if(a.contains("л")) {
                    strings.add(i, a);
                    i++;
                }
            }
        }
        return strings;
    }
}
