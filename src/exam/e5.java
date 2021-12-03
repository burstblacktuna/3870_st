package exam;

import java.util.Scanner;
import static java.lang.System.*;

public class e5 {

    public static void main(String[] args) {
        int sum=0;
        while (true) {
            var a = new Scanner(in);
            out.println("INPUT:");
            int x = a.nextInt();
            if (x == 0) {
                out.print("end");
                break;
            }
            out.print(sum);
            sum+=x;
            out.println("+"+x+"="+sum);
        }
    }
}