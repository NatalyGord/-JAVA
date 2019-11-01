//если число составное - true, если простое - false
package Loop;
import java.util.Scanner;
public class Loop26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean res = false;
        int i = 1;
        while(i < number - 1){
            if(number % (number - i) == 0){
                res = true;
                break;
            }
            else{
                res = false;
                i++;
            }
        }
        System.out.println(res);
    }
}
