//индекс - номер дома, число кол-во жильцов. На какой стороне больше жильцов.
package Tasks;

import java.io.*;

public class Task16 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int sumNech = 0;
        int sumChet = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = (Integer.parseInt(reader.readLine()));
            if (i % 2 == 0){
                sumChet = sumChet + arr[i];
            }
            else{
                sumNech = sumNech + arr[i];
            }
        }
        if(sumChet > sumNech){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
