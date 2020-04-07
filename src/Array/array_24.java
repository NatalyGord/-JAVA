//считывает имена из 4 строк и выводит их в обратном порядке
package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class array_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            String wor = scanner.nextLine();
            String [] arr = wor.trim().split("\\s+");
            for(int j = 0; j < arr.length; j++) {
                arrayList.add(arr[j]);
            }
        }
        for(int i = arrayList.size() - 1 ; i >= 0; i--){
            System.out.println(arrayList.get(i));
        }
    }
}
