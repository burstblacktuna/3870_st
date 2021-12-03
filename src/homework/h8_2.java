package homework;

import static java.lang.System.*;

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

        String maxman = null;
        int max1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            out.print(y[i] + "\t\t");
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
                out.print(a[i][j] + "\t\t");
            }
            if (sum > max1) {
                max1 = sum;
                maxman = y[i];
            }
            out.print(sum + "\t\n");
        }
        String maxproduct = null;
        int max2 = 0;
        int[] psum = {0, 0, 0, 0, 0};
        out.print("總額");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                psum[j] += a[i][j];
            }
            if (psum[i] > max2) {
                max2 = psum[i];
                maxproduct = x[i];
            }
        }
        for (int i : psum) {
            out.print("\t" + i + "\t");
        }
        out.println("\n業績最好銷售員為:" + maxman);
        out.println("銷售最好產品為:" + maxproduct);
    }
}
