//1 вв - колво предприятий, 2 - доход, 3 - % налога, узнать какое предприятие платит больше налога.
package different;
import java.util.Scanner;
public class diff_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        int [] array2 = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < len; i++){
            array2[i] = scanner.nextInt();
        }
        double [] summ = new double[len];
        for(int i = 0; i < len; i++){
            summ[i] = array[i] * array2[i] * 0.01;
        }
        double res = summ[0];
        int n = 0;
        for(double ar: summ){
            if(res < ar){
                res = ar;
            }
        }
        for(int i = 0; i < len; i++){
            if(summ[i] == res){
                n = i + 1;
                break;
            }
        }
        System.out.println(n);
    }
}
