package one_h;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class t1 {
    public static void main(String[] args) {
        var sc = new Scanner(in);
        out.println("請輸入a:");
        int a = sc.nextInt();
        out.println("請輸入b");
        int b = sc.nextInt();
        out.println("請輸入c");
        int c = sc.nextInt();
        int[] x={a,b,c};
        Arrays.sort(x);
        out.println("最大值為："+x[2]+"\n最小值為："+x[0]);
    }
}