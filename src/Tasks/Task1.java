//подсчет количества символов, которые повторяются более 1 раза в строке
package Tasks;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
//        String str1 = "aabbcde";
//        String str1 = "aabBcde";
//        String str1 = "indivisibility";
//        String str1 = "Indivisibilities";
//        String str1 = "aA11";
//        String str1 = "ABBA";
        String str1 = "";

        int n = 0;
        int n1 = 0;
        if (str1.length() > 0) {
            String str2 = (str1.toLowerCase());
            char[] str = str2.toCharArray();
            Arrays.sort(str);
            System.out.println(str);
            System.out.println(str.length);
            char c = str[0];
            for (int i = 1; i < str.length; i++) {
                if (c == str[i]) {
                    n++;
                } else {
                    if ((n >= 1) && (c != ' ')) {
                        ++n1;
                        n = 0;
                    }
                }
                c = str[i];
            }
            if (n >= 1) {
                ++n1;
            }
        }
        System.out.println(n1);
    }
}
