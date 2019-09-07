//Улитка ползет вверх по стеблю высоты H.
//днем она ползет вверх (A), а ночью вниз(B).
//За сколько дней улитка достигнет вершины?
//На вход программа получает неотрицательные целые числа H, A, B,
// где H> B и A> B. Каждое целое число не превышает 100.
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hOst = 0 + a;
        int n = 1;
        while(hOst<h){
            hOst = hOst - b + a;
            n++;
        }
        System.out.print(n);
    }
}