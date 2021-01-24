//список из массивов
package Tasks;

import java.util.ArrayList;

public class Task52 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> array = new ArrayList<int[]>();
        int[] a1 = new int[5];
        for (int i = 0; i < 5; i++) {
            a1[i] = i + 1;
        }
        int[] a2 = new int[2];
        for (int i = 0; i < 2; i++) {
            a2[i] = (i + 1) * 10;
        }
        int[] a3 = new int[4];
        for (int i = 0; i < 4; i++) {
            a3[i] = (i + 1) * 100;
        }
        int[] a4 = new int[7];
        for (int i = 0; i < 7; i++) {
            a4[i] = i + 10;
        }
        int[] a5 = new int[0];

        array.add(a1);
        array.add(a2);
        array.add(a3);
        array.add(a4);
        array.add(a5);

        return array;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
