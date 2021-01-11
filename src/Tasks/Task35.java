//удаляем из Set все числа больше 10
package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Task35 {

    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> set1 = new HashSet<>(set);
        for (int a : set1) {
            if (a > 10) {
                set.remove(a);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = removeAllNumbersGreaterThan10(createSet());
        for (int a : set) {
            System.out.print(a + " ");
        }
    }
}
