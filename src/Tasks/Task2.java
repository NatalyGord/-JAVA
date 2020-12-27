//символ, который встречается нечетное количество раз
package Tasks;

public class Task2 {

    public static void main(String[] args) {
        int count = 0;
        int[] a = {1, 2, 5, 1, 5, 2, 5};
        for (int i = 0; i < a.length; ++i) {
            for (int num : a) {
                if (a[i] == num) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
