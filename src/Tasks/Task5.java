//проверка является ли строка палиндромом
package Tasks;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {
        isPalindrome("Madam, I'm Adam!");
    }

    public static boolean isPalindrome(String text) {
        char[] t2 = text.toLowerCase().toCharArray();
        ArrayList<Character> t3 = new ArrayList<Character>();
        ArrayList<Character> t4 = new ArrayList<Character>();

        for (int i = 0; i < text.length(); i++) {
            if ((t2[i] > 47 && t2[i] < 58) || (t2[i] > 96 && t2[i] < 123)) {
                t3.add(t2[i]);
            }
        }
        for (int i = t3.size() - 1, j = 0; i >= 0; i--, j++) {
            t4.add(t3.get(i));
        }
        System.out.println(t3.equals(t4));
        return t3.equals(t4);

//        String res = text.replaceAll("[^a-zA-Z0-9]", "");
//        return res.equalsIgnoreCase(new StringBuilder(res).reverse().toString());
    }
}
