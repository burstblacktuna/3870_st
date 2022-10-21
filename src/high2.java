import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.*;

public class high2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(in);
        while (true){
            int x = a.nextInt();
            for (int i = 1; i <= x; i++) {
                if (i % 35 == 0) {
                    if (i == 35) out.print(i);
                    else out.print(" "+i);
                }
            }
            out.println();
            if (x==0)break;
        }
    }
}