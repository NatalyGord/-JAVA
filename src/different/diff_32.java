//угадай число
package different;
import java.util.Scanner;

public class diff_32 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число");
        //int range = 100;
        for(int i = 10; i <= 30; i += 10) {
            int number = (int) (Math.random() * i);
            playLvl(i, number);
        }
        System.out.println("Вы выиграли!!!");
        scanner.close();
    }
    private static void playLvl(int range, int number){
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
    }
}
