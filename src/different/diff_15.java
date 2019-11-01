//проверка алфавитного порядка в массиве.
package different;
import java.util.Scanner;

public class diff_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = true;
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int len1 = arr[i - 1].length(); //длина 1 слова
            int len2 = arr[i].length(); //длина 2 слова
            int a;
            if(len1 <= len2){
                a = len1;
            }
            else{
                a = len2;
            }
            int j = 0;
            while(j < a && res == true){
                if (arr[i - 1].charAt(j) == arr[i].charAt(j)) {
                    res = true;
                    //System.out.println(arr[i - 1].charAt(j));
                    //System.out.println(arr[i].charAt(j));
                    //System.out.println(res);
                    j++;
                    if((len1 - len2) > 0){
                        res = false;
                        break;
                    }
                }
                else {
                    if (arr[i - 1].charAt(j) < arr[i].charAt(j)) {
                        res = true;
                        //System.out.println(arr[i - 1].charAt(j));
                        //System.out.println(arr[i].charAt(j));
                        //System.out.println(res);
                        j++;
                        break;
                    }
                    else {
                        res = false;
                        //System.out.println(arr[i - 1].charAt(j));
                        //System.out.println(arr[i].charAt(j));
                        //System.out.println(res);
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}

/* String[] arr = scanner.nextLine().trim().split(" ");

        boolean alphabetical = true;
        String lastOne = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(lastOne) < 0) {
                alphabetical = false;
                break;
            }
            lastOne = arr[i];
        }*/
