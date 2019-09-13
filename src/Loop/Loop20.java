//Напишите программу, которая печатает часть последовательности
// 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (число повторяется столько раз, сколько оно равно).
// дано n: количество элементов последовательности, которые программа должна распечатать
package Loop;
import java.util.Scanner;
public class Loop20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int k = n;
        while(i <= n){
            for(int a = i; a > 0; a--){    //прокручивает i столько раз пока небудет =0
                System.out.print(i + " ");
                k--;
                if(k == 0){
                    break;
                }
            }
            if(k == 0){
                break;
            }
            i++;
        }
    }
}
