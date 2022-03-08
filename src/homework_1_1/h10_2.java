package homework_1_1;

import java.text.DecimalFormat;

import static java.lang.System.*;

public class h10_2 {
    public static double circle(double r) {
        return (3.14 * Math.pow(r, 2));
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        var point = new DecimalFormat("#.0#");

        int i = 2;
        out.println("半徑=" + i + ",面積為:" + circle(i));

        float f = 2.3f;
        out.println("半徑=" + f + ",面積為:" + point.format(circle(f)));

        double d = 2.3;
        out.println("半徑=" + d + ",面積為:" + point.format(circle(d)));
    }
}
