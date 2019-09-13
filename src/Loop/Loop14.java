//дано m- денег в банке, p- проценты в год, k-нужная сумма
//сколько лет надо копить
package Loop;
import java.util.Scanner;
public class Loop14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 0;
        while(k > m){
            m = m + m * p * 0.01;
            n++;
        }
        System.out.println(n);
    }
}