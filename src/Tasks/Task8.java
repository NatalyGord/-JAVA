//сумма числел введеных с клавиатуры
package Tasks;
import java.io.*;

public class Task8 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            int a = Integer.parseInt(reader.readLine());
            sum += a;
            if(a == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}
