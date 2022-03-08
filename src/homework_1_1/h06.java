package homework_1_1;

import static java.lang.System.*;

public class h06 {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2};
        out.println("(a):" + array.length);
        int count = 0;
        for (int j : array) {
            if (j >= 3 && j <= 6)
                count++;
        }
        out.println("(b):" + count);
        int maxIndex = 0, minIndex = 0;
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i ;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i ;
            }
        }
        out.println(maxIndex);
        out.println(minIndex);
    }
}