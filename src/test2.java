import java.util.Scanner;

import static java.lang.System.*;

public class test2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(in);
        out.print("輸入行數:");
        int time = a.nextInt();
        int[] score = new int[args.length];

        for (int i = 0; i < time; i++) {
            out.print("輸入數列:");
            int m = a.nextInt();
        }
        out.println("總");
        int t =0;
        for (int i = 0; i < time; i++) {
            t+=score[i];
            out.println(score[i]+" ");

        }
    }
}
