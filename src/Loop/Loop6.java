//если число из интервала /3 пишем Fizz /5 Buzz
// если делится и на 3 и на 5 FizzBuzz
package Loop;
import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 0;
        for(i = a; i <= b; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                if(i % 3 == 0){
                    System.out.println("Fizz");
                }
                else{
                    if(i % 5 == 0){
                        System.out.println("Buzz");
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }
        }

    }
}