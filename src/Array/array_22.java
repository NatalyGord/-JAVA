package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class array_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "0";
        int aInt = 0;
        double num = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(!"end".equals(a)){
            a = scanner.next();
            if(a.matches("-*[0-9]+")){
                aInt = Integer.parseInt(a);
                arrayList.add(aInt);
            }
            num++;
            //System.out.print(a + " ");
        }
        double n = Math.sqrt(num - 1);
        int m = (int)n;
        //System.out.println(num);
        //System.out.println(n);
        int [][] arr = new int [m][m];
        int k = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = arrayList.get(k);
                k++;
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }
        int [][] arr2 = new int [m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(m == 1){
                    arr2[i][j] = arr[i][j] * 4;
                }
                else {
                    if (j == 0) {
                        if (i == 0) {
                            arr2[i][j] = arr[m - 1][j] + arr[i + 1][j] + arr[i][m - 1] + arr[i][j + 1];
                            //System.out.println(arr[m - 1][j] + " " + arr[i + 1][j] + " " + arr[i][m - 1] + " " + arr[i][j + 1] + " 0.0");
                        } else {
                            if (i == m - 1) {
                                arr2[i][j] = arr[i - 1][j] + arr[0][j] + arr[i][m - 1] + arr[i][j + 1];
                                //System.out.println(arr[i - 1][j] + " " + arr[0][j] + " " + arr[i][m - 1] + " " + arr[i][j + 1] + " - 1.0");

                            } else {
                                arr2[i][j] = arr[i - 1][j] + arr[i + 1][j] + arr[i][m - 1] + arr[i][j + 1];
                            }
                        }
                    } else {
                        if (j == m - 1) {
                            if (i == 0) {
                                arr2[i][j] = arr[m - 1][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][0];
                                //System.out.println(arr[m - 1][j] + " " + arr[i + 1][j] + " " + arr[i][j - 1] + " " + arr[i][0] + " - 0.1");
                            } else {
                                if (i == m - 1) {
                                    arr2[i][j] = arr[i - 1][j] + arr[0][j] + arr[i][j - 1] + arr[i][0];
                                   // System.out.println(arr[i - 1][j] + " " + arr[0][j] + " " + arr[i][j - 1] + " " + arr[i][0] + " - 1.1");
                                } else {
                                    arr2[i][j] = arr[i - 1][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][0];
                                }
                            }
                        } else {
                            if (i == 0) {
                                arr2[i][j] = arr[m - 1][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][j + 1];
                            } else {
                                if (i == m - 1) {
                                    arr2[i][j] = arr[i - 1][j] + arr[0][j] + arr[i][j - 1] + arr[i][j + 1];
                                } else {
                                    arr2[i][j] = arr[i - 1][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][j + 1];
                                }
                            }
                        }
                    }
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
