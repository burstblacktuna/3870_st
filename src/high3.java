import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.*;

public class high3 {
    public static void main(String[] args) {
        var a = new Scanner(in);
        var x = a.nextInt();
        int d=x/24/60/60;
        int h=x/60/60-d*24;
        int m=x/60-d*24*60-h*60;
        int s=x-d*24*60*60-h*60*60-m*60;

    }
}