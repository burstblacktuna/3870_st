package homework;

import java.util.Scanner;

import static java.lang.System.*;

public class h10_2 {
    public static double circle(double r){
        return (3.14*Math.pow(r,2));
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        var add = new Scanner(in);
        int i =add.nextInt();
        out.println("半徑="+i+",面積為:"+circle(i));

        float f = add.nextFloat();
        out.println("半徑="+f+",面積為:"+circle(f));

        double d = add.nextDouble();
        out.println("半徑="+d+",面積為:"+circle(d));
    }
}
