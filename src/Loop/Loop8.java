//n количество деталей(данные детектора 1-исправление, -1 - брак, 0 -идеал)
// вывести количество каждой позиции
package Loop;
import java.util.Scanner;
public class Loop8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if(num == 0){
                a++;
            }
            else if(num == 1){
                b++;
            }
            else if(num == -1){
                c++;
            }

        }
        System.out.print(a + " " + b + " " + c);
    }
}