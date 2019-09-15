//выводит сумму чисел в диапазоне от вкл  и до не вкл.
package Loop;
import java.util.Scanner;
public class Loop24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a == b){
            System.out.println(0);
        }
        else{
            long sum = a;
            if(a + 1 == b){
                System.out.println(a);
            }
            else {
                while (a < b - 1) {
                    a++;
                    sum = sum + a;
                }
                System.out.println(sum);
            }
        }
    }
}
/*
        long sum = 0;
        for (int i = from; i < to; ++i) {
            sum += i;
        }
        return sum;*/