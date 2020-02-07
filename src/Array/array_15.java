// поиск к мест рядом в кинотеатре (дано n рядов, m мест в ряде, сами ряды
// 1-занято, 0- свободно к - сколько совмесных мест надо) вывод ряд в котором есть места.
package Array;
import java.util.Scanner;
public class array_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int j = 0;
        int a = 0;
        int res = 0;
        int [][] arr = new int[n][m];
        for(i = 0; i < n; i++){
            for(j = 0; j< m; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for(i = 0; i < n; i++){
            for(j = 0; j< m; j++){
                if(arr[i][j] == 0){
                    a++;
                    if(a >= k){
                        res = i + 1;
                        i = n;
                        j = m;
                    }
                }
                else{
                    a = 0;
                }
            }
            a = 0;
        }
        System.out.println(res);
    }
}
