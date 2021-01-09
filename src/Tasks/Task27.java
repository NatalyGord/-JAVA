package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task27 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}
