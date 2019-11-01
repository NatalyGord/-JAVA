package Loop;
import java.util.Scanner;
public class Loop27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a >= b && a >= c){
            System.out.println(1);
        }
        else{
            if(b > a && b >= c){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
    }
}
