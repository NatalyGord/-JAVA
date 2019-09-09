//n учеников и оценки 2 3 4 5(n штук)
// вывести количество каждой из оценок
package Loop;
import java.util.Scanner;
public class Loop7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if(num == 5){
                a++;
            }
            else if(num == 4){
                b++;
            }
            else if(num == 3){
                c++;
            }
            else if(num == 2){
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}