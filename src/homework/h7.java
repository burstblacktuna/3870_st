package homework;

import static java.lang.System.*;

public class h7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0, average = 0;
        for (int i : A) {
            sum += i;
        }
        average = sum / A.length;
        for (int i : A) {
            if (i < average) {
                out.print(i + " ");
            }
        }
        out.println("");
        int S = 140;
        out.print("0");
        for (int i = 1; i <= 140; i++) {
            if (140 % i == 0) {
                out.print(","+i );
            }
        }
    }
}
