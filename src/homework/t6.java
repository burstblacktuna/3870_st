package homework;

import static java.lang.System.*;

public class t6 {
    public static void main(String[] args) {
        int max, min, count = 0;
        int maxIndex = 0, minIndex = 0;
        int[] array = {3, 5, 1, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2};
        out.println("(a):" + array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 3 && array[i] <= 6)
                count++;
        }
        out.println("(b):" + count);
        max = min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i + 1;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i + 1;
            }
        }
        out.println(maxIndex);
        out.println(minIndex);
    }
}

