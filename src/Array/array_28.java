//метод получает неизвестное количество стринг элементов помещает все кроме повторяющихся в аррейлист и выводит отсортированный массив
package Array;
import java.util.ArrayList;
import java.util.Collections;
public class array_28 {

  public static void abc(String ... a){
    ArrayList <String> list = new ArrayList<>();
    for (String st: a){
      if(!list.contains(st)){
        list.add(st);
      }
    }
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }

  public static void main(String[] args) {
    abc("g", "a", "o", "m", "e", "a");
  }
}
