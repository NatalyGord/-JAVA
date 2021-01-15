//возвращает имя метода вызвавшего его
package Tasks;

public class Task47 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        System.out.println("Метод 1 вызвал - " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String method2() {
        method3();
        System.out.println("Метод 2 вызвал - " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        System.out.println("Метод 3 вызвал - " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        System.out.println("Метод 4 вызвал - " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        System.out.println("Метод 5 вызвал - " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
