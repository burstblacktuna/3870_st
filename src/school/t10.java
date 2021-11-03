package school;

import static java.lang.System.out;

public class t10 {
    public static void main(String[] args) {
        double sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 16 == 0) {
                out.println(i);
            }
        }
        out.println();
    }
}
