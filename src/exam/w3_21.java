package exam;

import java.util.Scanner;
import static java.lang.System.*;

public class w3_21 {

    public static void main(String[] args) {
        var scn = new Scanner(in);

        out.println("INPUT num1 :");
        int num1 = scn.nextInt();

        out.println("INPUT num2 :");
        int num2 = scn.nextInt();

        out.println("INPUT num3 :");
        int num3 = scn.nextInt();

        out.println("num1+num2+num3=" + (num1 + num2 + num3));

    }

}
