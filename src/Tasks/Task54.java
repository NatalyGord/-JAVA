package Tasks;

import java.io.*;
import java.util.*;

public class Task54{

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<Integer, String>();
        while (true) {
            String idStr = reader.readLine();
            if (idStr.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(idStr);
            String name = reader.readLine();

            map.put(id, name);
            System.out.println(id + " " + name);
        }
    }
}

