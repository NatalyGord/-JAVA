//дано число если оно четное делим его на 2, если нечетное *3 +1 выводем результат пока не получится 1
package Loop;
import java.util.Scanner;
public class Loop13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(num + " ");
        while(num != 1){
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + " ");
            }
            else {
                num = num * 3 + 1;
                System.out.print(num + " ");
            }
        }

    }
}
