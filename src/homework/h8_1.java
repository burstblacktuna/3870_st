package homework;

import java.text.DecimalFormat;

import static java.lang.System.*;

public class h8_1 {
    public static void main(String[] args) {
        double[][] a = {
                {18.2, 17.3, 15.0, 13.4},
                {23.8, 25.1, 20.6, 17.8},
                {20.6, 21.5, 18.4, 15.7}};
        String[] n = {"星期一", "星期二", "星期三", "星期四", "平均氣溫"};
        String[] s = {"時段一", "時段二", "時段三"};
        DecimalFormat df = new DecimalFormat("#.###");
        double sum;
        out.print("\t\t");
        for (String i : n) {
            out.print("\t" + i);
        }
        out.println();
        for (int i = 0; i < a.length; i++) {
            sum = 0.0;
            out.print(s[i] + "\t\t");
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
                out.print(a[i][j] + "\t");
            }
            out.print(sum / a[i].length + "\t\n");
        }
        out.print("日平均溫度");
        double[] daysum = {0, 0, 0, 0};
        for (double[] i : a) {
            for (int j = 0; j < i.length; j++) {
                daysum[j] += i[j];//依序將每天的時段1~3先加總
            }
        }
        for (int k = 0; k < daysum.length; k++) {
            String.format("%.2f", daysum[k] / a.length);
            if (k == daysum.length - 1) System.out.print("\t\t" + df.format(daysum[k] / a.length));
            else System.out.print("\t" + df.format(daysum[k] / a.length));
        }
        String maxday= null, minday = null;
        String maxtime = null,mintime = null;
        double mintemp = Double.MAX_VALUE;//取預設最高值
        double maxtemp = Double.MIN_VALUE;//取預設最低值
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxtemp) {
                    maxtemp = a[i][j];
                    maxday = n[j];
                    maxtime = s[i];
                }
                if (a[i][j] < mintemp) {
                    mintemp = a[i][j];
                    minday = n[j];
                    mintime = s[i];
                }
            }
        }
        System.out.println("\n溫度最高為" + maxday + " " + maxtime);
        System.out.println("溫度最低為" + minday + " " + mintime);
    }
}