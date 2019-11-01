// выводит n в степени m
package Loop;
import java.util.Scanner;
public class Loop25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long res = 1;
        for(int i = 0; i < m; i++){
            res *= n;
        }
        System.out.println(res);
    }
}
