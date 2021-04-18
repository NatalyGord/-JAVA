//Считывает адрес файла и выводит его содержимое на экран
package Tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task56 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inStream = new FileInputStream(reader.readLine());

        Scanner scanner = new Scanner(inStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
    }
}
