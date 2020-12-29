package Tasks;

import java.io.*;

public class Task7 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if(age < 18){
            System.out.println("Подрасти еще");
        }
    }
}
