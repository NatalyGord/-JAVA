package Tasks;

import java.io.*;
import java.util.*;

public class Task32 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(ArrayList<Integer> array) {
        Collections.sort(array);
        Collections.reverse(array);
    }
}
