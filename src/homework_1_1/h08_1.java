package homework_1_1;

import java.text.DecimalFormat;

import static java.lang.System.*;

public class h08_1 {
    public static void main(String[] args) {
        double[][] temp = {
                {18.2, 17.3, 15.0, 13.4},
                {23.8, 25.1, 20.6, 17.8},
                {20.6, 21.5, 18.4, 15.7}};
        String[] week = {"星期一", "星期二", "星期三", "星期四", "平均氣溫"};
        String[] time = {"時段一", "時段二", "時段三"};
        var point = new DecimalFormat("#.0");//控制小數點顯示位
        //
        out.print("\t\t");
        for (String i : week) {
            out.print("\t" + i);
        }
        out.println();
        //
        for (int i = 0; i < temp.length; i++) {
            double sum = 0.0;
            out.print(time[i] + "\t\t");
            for (int j = 0; j < temp[i].length; j++) {
                sum += temp[i][j];
                out.print(temp[i][j] + "\t");
            }
            out.print(point.format(sum / temp[i].length) + "\t\n");
        }
        //
        out.print("日平均溫度");
        double[] daysum = {0, 0, 0, 0};//將星期個別的總和儲存為陣列
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                daysum[j] += temp[i][j];//依序將每天的時段1~3先加總
            }
        }
        //此時 daysum = {62.6, 63.9, 54.0, 46.9}
        for (int i = 0; i < daysum.length; i++) {
            out.print("\t" + point.format(daysum[i] / temp.length));
        }
        out.print("\t單位(°C)");
        //
        String maxday = null, minday = null;
        String maxtime = null, mintime = null;
        double mintemp = Double.MAX_VALUE;//取預設最高值
        double maxtemp = Double.MIN_VALUE;//取預設最低值
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] > maxtemp) {//找最高時間
                    maxtemp = temp[i][j];
                    maxday = week[j];
                    maxtime = time[i];
                }
                if (temp[i][j] < mintemp) {//找最低時間
                    mintemp = temp[i][j];
                    minday = week[j];
                    mintime = time[i];
                }
            }
        }
        //
        out.println("\n溫度最高為" + maxday + " " + maxtime);
        out.println("溫度最低為" + minday + " " + mintime);
    }
}