package homework_1_1;

import static java.lang.System.*;

public class h12 {
    public static void main(String[] args) {
        var a = new CCount();
        var b = new CCount();
        CCount.count();
        CCount.setZero();
        CCount.setValue(5);
    }
    static class CCount {
        private static int cnt = 0;
        CCount() {cnt++;}

        public static void count() {
            out.println(cnt);
        }

        public static void setZero() {
            out.println(cnt = 0);
        }

        public static void setValue(int n) {
            out.println(cnt = n);
        }
    }
}
