package school;

import static java.lang.System.*;
import static java.util.Arrays.*;

public class s01 {
    public static void main( String[] args) {
        int[] array = {10, 3, 7, 1, 11, 6, 9, 4, 8, 2, 5};
        sort(array);
        for (int i : array) {
            out.print(i + " ");
        }
    }
}
