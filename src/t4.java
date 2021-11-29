import static java.lang.System.*;

public class t4 {

    public static void main(String[] args) {
        int[][] a = {
                {20, 21, 22, 23, 24},
                {31, 32, 33, 34, 35},
                {42, 43, 44, 45, 46}};
        String[] n = {"壹", "貳", "參", "肆", "伍", "SUM", "AVG", "MAX", "MIN"};
        String[] s = {"En", "Ch", "Mh"};
        int sum;
        for (String i : n) {
            out.print("\t" + i);
        }
        out.println();
        int MAX, MIN;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            out.print(s[i] + "\t");
            MAX = MIN = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
                if (a[i][j] > MAX) MAX = a[i][j];
                if (a[i][j] > MIN) MAX = a[i][j];
                if (j == a[i].length - 1) out.print(a[i][j] + "\t");
                else out.print(a[i][j] + ",\t");
            }
            out.print(sum + "\t" + sum / a[i].length + "\t" + MAX + "\t" + MIN + "\n");
        }
    }
}