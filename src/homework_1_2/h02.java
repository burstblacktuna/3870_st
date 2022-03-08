package homework_1_2;

import static java.lang.System.*;

public class h02 {
    public static void main(String[] args) {
        var a = new CWin();
        var b = new CWin();
        CWin.count();
        CWin.Cwin("blue", 5, 6);
        CWin.CWin();
        CWin.setZero();
        CWin.setValue(5);
    }
    static class CWin {
        static String color;
        static int width, height;
        static int cnt = 0;

        CWin() {cnt++;}

        static void count() {out.println(cnt);}

        static void Cwin(String str, int w, int h) {
            color = str;
            width = w;
            height = h;
            out.println(str + "," + w + "," + h);
        }

        static void CWin() {
            color = "Red";
            width = 2;
            height = 2;
            out.println(color + "," + width + "," + height);
        }

        static void setZero() {out.println(cnt = 0);}

        static void setValue(int n) {out.println(cnt = n);}
    }
}
