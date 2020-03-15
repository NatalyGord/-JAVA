package Array;
import java.util.*;
public class array_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = new String[9];
        for(int j = 0; j < 9; j++){
            arr[j] = scanner.next();
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("Asia")) {
                System.out.println("Asia");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("Africa")) {
                System.out.println("Africa");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("North")) {
                System.out.println("North America");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("South")) {
                System.out.println("South America");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("Antarctica")) {
                System.out.println("Antarctica");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("Europe")) {
                System.out.println("Europe");
            }
        }
        for(int j = 0; j < 9; j++){
            if(arr[j].equals("Australia")) {
                System.out.println("Australia");
            }
        }
    }
}

