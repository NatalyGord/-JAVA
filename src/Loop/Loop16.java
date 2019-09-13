package Loop;
import java.util.Scanner;
public class Loop16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 1;
        while(num >= a * a){
            System.out.println(a * a);
            a++;
        }
    }
}