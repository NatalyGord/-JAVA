package different;
import java.util.Scanner;

public class diff_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int t1 = ch*3600 + m*60 + s;
        int ch2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int t2 = ch2*3600 + m2*60 + s2;
        int res = t2 - t1;
        System.out.println(res);

    }
}

