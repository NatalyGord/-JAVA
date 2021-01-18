//вводим числа, если ввели не число, то программа выводит все введеные до этого числа
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task49 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){

            try {
                int a = Integer.parseInt(reader.readLine());
                arr.add(a);
            }
            catch (NumberFormatException e) {
                for(int n: arr) {
                    System.out.println(n);
                }
                break;
            }
            catch (IOException e){}
        }
    }
}

