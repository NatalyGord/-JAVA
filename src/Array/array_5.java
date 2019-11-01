package Array;

import java.util.Scanner;

public class array_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len= scanner.nextInt();int [] array = new int[len];
        boolean a = false;
        for(int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n= scanner.nextInt();
        for(int j = 0; j < len; j++){
            if(array[j] == n) {
                a = true;

                break;
            }
        }
        System.out.println(a);
    }
}
