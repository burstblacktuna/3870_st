package homework;

import java.util.Scanner;
import static java.lang.System.*;

public class h09 {
    public static void main(String[] args) {
        var add = new Scanner(in);
        for (int i =0;i<2;i++){
            int n = add.nextInt();
            addto(n);
            out.println(even(n));
        }
    }
    public static void addto(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        out.println(sum);
    }
    public static boolean even(int n) {
        return (n % 2 == 0);
    }
}
