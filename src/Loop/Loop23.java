//найти наибольшее число из последовательности до 0
package Loop;
import java.util.Scanner;
public class Loop23{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int a = 0;
        while((num = scanner.nextInt()) != 0){
            if (num >= a){
                a = num;
            }
            else{
                continue;
            }
        }
        System.out.println(a);
    }
}
