//индекс массы тела
package Tasks;

import java.io.*;

public class Task9 {

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(buff.readLine());
        double height = Double.parseDouble(buff.readLine());

        Mass.calcMass(weight, height);
    }

    public static class Mass {
        public static void calcMass(double weight, double height) {
            double a = weight / (height*height);
            if (a < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            }
            if (a < 25 && a >= 18.5) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if ( a < 30 && a >= 25 ) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (a >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}

