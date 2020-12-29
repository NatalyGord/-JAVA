//объединение двух отсортированных массивов
package Tasks;

public class Task4 {

    public static void main(String[] args) {
        int[] a1 = {1, 3, 7};
        int[] a2 = {0, 1, 4, 8, 10};

        mergeArrays(a1, a2);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        for (int i = 0, j = 0, k = 0; i < a1.length + a2.length; i++) {
            if ((j < a1.length) && ((k == a2.length) || (a1[j] < a2[k]))) {
                res[i] = a1[j];
                j++;
            } else {
                res[i] = a2[k];
                k++;
            }
        }

        for (int a : res) {
            System.out.print(a + " ");
        }
        return res;
    }
}
