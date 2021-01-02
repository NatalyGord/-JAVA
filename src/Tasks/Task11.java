//минимум из 5 введеных чисел
package Tasks;

import java.io.*;

public class Task11 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }
        public static int min(int a, int b, int c, int d, int e) {
       return ((((a < b ? a : b) < (c < d ? c : d))? (a < b ? a : b):(c < d ? c : d)) < e)
               ? (((a < b ? a : b) < (c < d ? c : d))? (a < b ? a : b):(c < d ? c : d)) : e;
    }
}
