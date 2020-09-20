package Scanning;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*
Чётные и нечётные циферки
*/
public class Ex_6 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String w = reader.readLine();
      int wSize = w.length();
      int wInt = Integer.parseInt(w);
//      Scanner scanner = new Scanner(System.in);
//      int w = Integer.parseInt(scanner.next());
      int z = (int)Math.pow(10,(wSize-1));
      for(int i = 0; i < wSize; i++){
        if((wInt / z) % 2 == 0 ){
          even++;
        }
        else{
          odd++;
        }
        z /= 10;
      }
      System.out.println("Even: " + even + " Odd: " + odd);
    }
  }

