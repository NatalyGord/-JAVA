//сортировка
package Tasks;

import java.io.*;
import java.util.*;

public class Task13 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            arr.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }
}
