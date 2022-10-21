package one_h;

import java.io.*;
import java.text.DecimalFormat;
import static java.lang.System.*;

public class s1 {
    public static void main(String[] args) throws Exception {
        double k;
        int h, s;
        var point = new DecimalFormat("#.##");
        var br = new BufferedReader(new InputStreamReader(in));
        out.println("[計算標準體重範圍]\n");
        out.print("請輸入身高(cm)：");
        h = Integer.parseInt(br.readLine());
        out.print("請輸入性別(1:男 2:女)：");
        s = Integer.parseInt(br.readLine());
        switch (s) {
            case 1 -> {
                k = (h - 80) * .7;
                out.println("成年男性：" + point.format(k * .9) + "~" + point.format(k * 1.1) + "KG");
            }
            case 2 -> {
                k = (h - 70) * .6;
                out.println("成年女性：" + point.format(k * .9) + "~" + point.format(k * 1.1) + "KG");
            }
            default -> out.print("輸入錯誤，結束程式");
        }
    }
}