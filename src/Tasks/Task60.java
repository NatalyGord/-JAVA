//Нахождение меньшего простого числа
package Tasks;

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);

        Task60.findingSmallerPrime(x);
    }


    public static void findingSmallerPrime(int x) {
        if(x <= 2) {
            System.out.println("Невозможно найти меньшее простое число для: " + x);
        }
        else {
            int num = x - 1;
            boolean result = false;
            for (int i = 0; i < x - 1; i++) {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        result = false;
                        break;
                    } else {
                        result = true;
                    }
                }
                if (result) {
                    break;
                } else {
                    num--;
                }
            }

            System.out.println("Первое меньшее простое число: " + num);
        }
    }
}

