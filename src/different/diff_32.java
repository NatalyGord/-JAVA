//угадай число
package different;

import java.util.Scanner;

public class diff_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число");
        System.out.println("Введите до какого числа загадываем");
        int range = scanner.nextInt();    //10;
        int number = (int)(Math.random() * range);
        while(true){
            System.out.println("Угадайте число от 0 до " + range);
            int imp = scanner.nextInt();
            if(imp == number){
                System.out.println("Вы угадали!");
                break;
            }
            else{
                if(imp > number){
                    System.out.println("Загаданное число меньше");
                }
                else{
                    System.out.println("Загаданное число больше");
                }
            }
        }
        scanner.close();
    }
}
