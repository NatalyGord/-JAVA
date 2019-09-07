//N белки нашли K орехов и решили разделить их поровну.
// Определите, сколько орехов получит каждая белка.
//n и k положительные числа не более 10000
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(k / n);
    }
}