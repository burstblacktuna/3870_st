package homework;

import static java.lang.System.*;

public class t6 {
    public static void main(String[] args) {
        int max, min, count = 0;
        int[] array = {3, 5, -1, 3, 2, 4, 1, 6, 99, 5, 4, 3, 2};
        /*
        out.println("(a):" + array.length);
        for (int j : array) {
            if (j >= 3 && j <= 6)
                count++;
        }
        out.println("(b):" + count);
         */
        int maxIndex = 0, minIndex = 0,q=0;
        max = min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
                maxIndex=q;
            }
            q++;
        }
        out.println(maxIndex);
        out.println(minIndex);
    }
}