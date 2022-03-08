package homework_1_2;

import java.text.DecimalFormat;
import static java.lang.System.*;

public class h01 {
    public static void main(String[] args) {
        add2n(5);
        add2n(10);
        power(2,5);
        power(3,2);
    }
    public static void add2n(int n) {
        int sum=0;
        for (int i=1;i<=n;i++)sum+=i;
        out.println(sum);
    }
    public static void power(int x,int n) {
        var point = new DecimalFormat();
        out.println(point.format(Math.pow(x,n)));
    }
}