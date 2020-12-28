//factorial
package Tasks;

import java.math.BigInteger;

public class Task3 {

    public static void main(String[] args) {
        factorial(3);
    }
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.valueOf(1);
        for(int i = 1; i <= value; i++){
           res = BigInteger.valueOf(i).multiply(res);
        }
        System.out.println(res);
        return res;
    }
}
