//значения в строке одинаковы - YES иначе - NO
package Array;
import java.util.Scanner;
public class array_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        String s;
        String res = "NO";
        char [][] arr = new char[4][4];
        for(i = 0; i < 4; i++){
            String a = scanner.nextLine();
            for(j = 0; j < 4; j++){
                arr [i][j] = a.charAt(j);
            }
        }
        for(i = 0; i < 4; i++){
            s = arr[i][0] + " ";
            for(j = 1; j < 4; j++){
                if (s.equals(arr [i][j] + " ")){
                    res = "YES";
                    s = arr[i][j] + " ";
                }
                else{
                    res = "NO";
                    j = 10;
                    i = 10;
                }

                //System.out.println(s);
               // System.out.println(res);

            }
        }
        System.out.println(res);
    }
}
