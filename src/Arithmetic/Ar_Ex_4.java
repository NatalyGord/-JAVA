// три класса со столами. за одним столом может быть 2 человека.
// рассчитать сколько понадобится столов.
// входящие данные количество человек в классах.
package Arithmetic;
import java.util.Scanner;
public class Ar_Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stud1 = scanner.nextInt();
        int stud2 = scanner.nextInt();
        int stud3 = scanner.nextInt();
        int desk = stud1/2+stud1%2+stud2/2+stud2%2+stud3/2+stud3%2;
        System.out.print(desk);
    }
}
