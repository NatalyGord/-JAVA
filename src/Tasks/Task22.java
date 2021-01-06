//разделение чисел введеных с клавиатуры на те, что делятся на 3, на 2 и остальные
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task22 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arrN = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr.add(a);
            if(a % 2 == 0){
                arr2.add(a);
            }
            if(a % 3 == 0){
                arr3.add(a);
            }
            if((a % 2 != 0) && (a % 3 != 0)){
                arrN.add(a);
            }
        }
        printList(arr3);
        printList(arr2);
        printList(arrN);
    }
    public static void printList(ArrayList<Integer> list) {
        for(int n: list){
            System.out.println(n);
        }
    }
}
