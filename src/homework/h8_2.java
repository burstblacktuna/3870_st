package homework;

import static java.lang.System.*;

import java.util.Scanner;

public class h8_2 {
    public static void main(String[] args) {
        int[][] a = {
                {33, 32, 56, 45, 33},
                {77, 33, 68, 45, 23},
                {43, 55, 43, 67, 65}};
        String[] x = {"產品A", "產品B", "產品C", "產品D", "產品E", "總額"};
        String[] y = {"1", "2", "3"};
        int sum;
        out.print("銷售員");
        for (String i : x) {
            out.print("\t" + i);
        }
        out.println();
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            out.print(y[i] + "\t\t");
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
                out.print(a[i][j] + "\t\t");
            }
            out.print(sum + "\t\n");
        }
        int[] psum = {0, 0, 0, 0, 0};
        out.print("總額");
        for (int[] i : a) {
            for (int j = 0; j < i.length; j++) {
                psum[j] += i[j];
            }
        }
        for (int i : psum) {
            out.print("\t" + i + "\t");
        }
        int maxman = 0;
        double max = Double.MIN_VALUE;//取預設最低值
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                double maxsum = a[i][j];
                if (maxsum > max) {
                    max = maxsum;
                    maxman = j;
                }
            }
        }
        out.println("\n"+max);
        out.print(maxman+1);
    }
}
