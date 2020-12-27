//является ли число результатом возведения двойки в степень
package Arithmetic;

public class Ar_Ex_10 {

    public static void main(String[] args) {

        flipBit(-2);
    }

    public static void flipBit(int value) {
        boolean a = false;
        for (int i = 0; i < 30; i++) {
            if (Math.pow(2, i) == Math.abs(value)) {
                System.out.println("Число является степенью числа 2");
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("false");
        }
    }
}