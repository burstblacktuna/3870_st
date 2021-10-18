package school;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class t2 {
    public static void main(String[] args) {
        var a = new Scanner(in);
        var x = a.nextInt();
        if (x > 0) {
            out.println(x);
        } else {
            out.println(-x);
        }

        if (x % 2 == 0) {
            out.println("整數");
        } else {
            out.println("奇數");
        }
    }
}
