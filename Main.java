import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Вводим 4 числа
        double n = in.nextInt();
        double i = in.nextInt();
        double p = in.nextInt();
        double l = in.nextInt();
        // Ищем 2 по величине число
        if ((n > i && n < p && n < l)||
            (n > p && n < i && n < l)||
            (n > l && n < i && n < p)) {
            out.println(n);
        }
        else if ((i > n && i < p && i < l)||
                 (i > p && i < n && i < l)||
                 (i > l && i < n && i < p)) {
            out.println(i);
        }
        else if ((p > n && p < i && p < l)||
                 (p > i && p < n && p < l)||
                 (p > l && p < n && p < i)) {
            out.println(p);
        }
        else if ((l > n && l < i && l < p)||
                 (l > i && l < n && l < p)||
                 (l > p && l < n && l < i)) {
            out.println(l);
        }
    }
}
