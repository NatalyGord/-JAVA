//получаем количество элементов <1000
//затем сами элементы <30000
//вывести максимальный элемент кратный 4.
package Loop;
import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++){
            int num = scanner.nextInt();
            if(num % 4 == 0 && num > res){
                res = num;
            }
        }
        System.out.println(res);
    }
}
