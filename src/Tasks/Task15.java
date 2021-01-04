//деление массива на 2 маленьких
package Tasks;

import java.io.*;

public class Task15 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (Integer.parseInt(reader.readLine()));
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i < 20;){
            for(int j = 0; j < 10; j++, i++){
                arr1[j] = arr[i];
            }
            for(int j = 0; j < 10; j++, i++){
                arr2[j] = arr[i];
                System.out.println(arr2[j]);
            }
        }
    }
}
