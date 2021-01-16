//номер строки которая вызывает метод
package Tasks;

public class Task48 {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        System.out.println("Метод 1 вызвал - строка " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        System.out.println("Метод 2 вызвал - строка " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        System.out.println("Метод 3 вызвал - строка " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        System.out.println("Метод 4 вызвал - строка " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        System.out.println("Метод 5 вызвал - строка " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
