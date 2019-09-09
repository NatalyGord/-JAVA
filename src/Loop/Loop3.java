//Счастливые номера
package Loop;
import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int n = num.length();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n / 2; i++) {
            int a = Character.getNumericValue(num.charAt(i));
            int b = Character.getNumericValue(num.charAt(n - 1 - i));
            sum1 = sum1 + a;
            sum2 = sum2 + b;
        }
        if(sum1 == sum2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}