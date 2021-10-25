package school;

import static java.lang.System.*;

public class t4 {
    public static void main(String[] args) {
        double s = 3500;
        for (int d = 1; true; d++) {
            s = s / 2;
            out.println(s);
            if (s < 3) {
                out.println("天數:" + d);
                break;
            }
        }
        out.println();

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = (int) (sum + Math.pow(i, 2));

        }
        out.println("1到100平方總和:" + sum);

        out.println();

        double sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 16 == 0) {
                out.println(i);
            }
        }
        out.println();


        for (int i = 0; i <= 5; i++) {
            for (int w = 1; w <= i; w++) {
                out.print(w);
            }
            out.println();
        }
        out.println();

        for (double i = 1; i <= 10; i++) {
            sum1 = sum1 + 1 / i;


        }
        out.println(sum1);

    }
}