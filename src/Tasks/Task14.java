//максимум из массива чисел
package Tasks;

import java.io.*;

public class Task14 {

    public static void main(String[] args) throws IOException {

        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {   //создаем и заполняем массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (Integer.parseInt(reader.readLine()));
        }
        return arr;
    }
    public static int max(int[] array) {   //находим максимальное значение
        int m = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }
        return m;
    }
}
