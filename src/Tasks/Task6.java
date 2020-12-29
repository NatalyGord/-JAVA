//вывод самой длинной последовательности повторяющихся чисел (из введеных 10)
package Tasks;

import java.io.*;
import java.util.*;

public class Task6 {

    public static void main(String[] args) throws IOException{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 1;
        int b = 0;
        int a = scanner.nextInt();
        list.add(a);
        for(int i = 0, n = 1; i < 9; i++){
           b = scanner.nextInt();
           list.add(b);
           if(a == b){
               ++n;
           }
           else{
               n = 1;
           }
           a = b;
           if(n > num) {
                num = n;
            }
       }
        System.out.println(num);
    }
}
