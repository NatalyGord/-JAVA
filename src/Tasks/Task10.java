//сумма чисел вв с клавиатуры
package Tasks;

import java.io.*;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
       int sum = 0;

       while(true){
           String aStr = buff.readLine();
           if(aStr.equals("сумма")){
               System.out.println(sum);
               break;
           }
           int a = Integer.parseInt(aStr);
           sum += a;
       }
    }
}
