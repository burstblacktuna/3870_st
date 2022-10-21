package one_h;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class t2 {
    public static void main(String[] args) {
        var sc = new Scanner(in);
        out.println("請輸入d1:");
        int d1 = sc.nextInt();
        out.println("請輸入d2");
        int d2 = sc.nextInt();
        out.println("請輸入d3");
        int d3 = sc.nextInt();
        int[] usr = {d1,d2,d3};
        int[] cmp = {(int) (Math.random()*6)+1,(int) (Math.random()*6)+1,(int) (Math.random()*6)+1};
        int us=d1+d2+d3,cs=0;
        out.print("USER：\n"+Arrays.toString(usr));
        out.println("\t總和"+us);
        out.print("CMP：\n"+Arrays.toString(cmp));
        for (int i : cmp) {
            cs += i;
        }
        out.println("\t總和"+cs);

        /*switch () {
            case 1 -> {
            }
            case 2 ->{
            }
            default -> out.println("a");
        }
         */
    }
}