package homework;

import java.text.DecimalFormat;
import java.util.Arrays;

import static java.lang.System.*;

public class h8_2 {
    public static void main(String[] args) {
        int[][] a = {
                {33, 32, 56, 45, 33},
                {77, 33, 68, 45, 23},
                {43, 55, 43, 67, 65}};
        String[] p = {"產品A", "產品B", "產品C", "產品D", "產品E"};
        int[] pp = {12,16,10,14,15};
        String[] y = {"1", "2", "3"};
        var df = new DecimalFormat(",###");
        out.print("銷售員");
        for (String i : p) {
            out.print("\t" + i);
        }
        out.print("\t總額\n");

        String maxman = null;
        int max1 = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            out.print(y[i] + "\t\t");
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j]*pp[j];
                out.print(a[i][j] + "\t\t");
            }
            if (sum > max1) {
                max1 = sum;
                maxman = y[i];
            }
            out.print(df.format(sum) + "\t\n");
        }
        String maxproduct = null;
        int max2 = 0;
        int[] psum = {0, 0, 0, 0, 0};
        out.print("總額");
        for (int[] ints : a) {
            for (int j = 0; j < ints.length; j++) {
                psum[j] += ints[j] * pp[j];
                if (psum[j] > max2) {
                    max2 = psum[j];
                    maxproduct = p[j];
                }
            }
        }
        for (int i : psum) out.print("\t" + df.format(i));//
        out.print("\t單位(元)");
        out.println("\n業績最好銷售員為:" + maxman);
        out.println("銷售最好產品為:" + maxproduct);
    }
}
