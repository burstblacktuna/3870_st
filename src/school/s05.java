package school;

import java.text.DecimalFormat;

import static java.lang.System.*;

public class s05 {
    /*------------------------------------------------------------*/
    public static void arr(String[] a) {
        for (String i : a) {
            out.print(i + "\t");
        }
        out.println();
    }
    /*------------------------------------------------------------*/
    public static void arr2(double[][] a) {
        for (double[] i : a) {
            for (double j : i) {
                out.print(j + "\t");
            }
            out.println();
        }
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        double[][] temp = {
                {18.2, 17.3, 15.0, 13.4},
                {23.8, 25.1, 20.6, 17.8},
                {20.6, 21.5, 18.4, 15.7}};
        String[] week = {"星期一", "星期二", "星期三", "星期四"};
        String[] time = {"時段一", "時段二", "時段三"};
        var point = new DecimalFormat("#.0");//控制小數點顯示位
        //
        arr(week);
        //
        arr2(temp);

    }
    /*------------------------------------------------------------*/
}
