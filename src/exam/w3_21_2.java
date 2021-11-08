package exam;

import java.util.Scanner;
import static java.lang.System.*;

public class w3_21_2 {

    public static void main(String[] args) {
        int sum=0;
        while (true) {
            var a = new Scanner(in);
            out.println("INPUT:");
            int x = a.nextInt();
            out.print(sum);
            sum=sum+x;
            if (x == 0) {
                out.print("end");
                break;
            }
            out.println("+"+x+"="+sum);
        }
    }
}