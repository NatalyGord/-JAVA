//проверка строки на гласные и согласные, вывод сначала гласные затем согласные
package Tasks;

import java.io.*;
import java.util.ArrayList;

public class Task51 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char [] strCh = str.toCharArray();
        ArrayList <Character> gl = new ArrayList<>();
        ArrayList <Character> sgl = new ArrayList<>();
        for(char ch: strCh){
            if(isVowel(ch)){
                gl.add(ch);
            }
            else {
                if(ch != ' ') {
                    sgl.add(ch);
                }
            }
        }
        for (Character s: gl) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Character s: sgl) {
            System.out.print(s + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
