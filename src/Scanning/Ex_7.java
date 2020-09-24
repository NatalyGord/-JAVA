package Scanning;
import java.util.Scanner;
public class Ex_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int res =scanner.nextInt();;
    for (int i = 0; i < 3; i++) {
      int n1 = scanner.nextInt();
      if(n1 > res){
        res = n1;
      }
    }
    System.out.println(res);
  }
}
