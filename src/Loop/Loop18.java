//h высота автобуса, n  количество мостов и дана их высота
//узнать потерпит ли крушение автобус и на каком мосту
package Loop;
import java.util.Scanner;
public class Loop18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); //высота автобуса
        int n = scanner.nextInt(); //количество мостов
        for(int i = 1; i <= n; i++) {
            int m = scanner.nextInt(); //высота моста
            if(h >= m){
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if(i == n && h < m){
                System.out.println("Will not crash");
            }
        }
    }
}
