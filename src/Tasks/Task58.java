//считывает имя файла, числа из него и выводит по возрастанию только четные
package Tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inStream = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(inStream);

        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(list);
        for (int a: list) {
            if(a%2 == 0){
                System.out.println(a);
            }
        }
        scanner.close();
        reader.close();
    }
}
