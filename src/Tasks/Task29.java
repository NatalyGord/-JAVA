//заполнение массива и min max
package Tasks;

import java.io.*;

public class Task29 {

    public static void main(String[] args) throws IOException {
        int [] arr = getInts();
        int maximum = arr[0];
        int minimum = arr[0];
        for(int a: arr){
            if(maximum < a){
                maximum = a;
            }
            if(minimum > a){
                minimum = a;
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (Integer.parseInt(reader.readLine()));
        }
        return arr;
    }
}
