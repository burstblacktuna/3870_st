package homework_1_1;

import java.util.Scanner;

import static java.lang.System.*;

public class h10_1_1 {
    public static long fib(int n){
        if(n==1)
            return 1;
        else if (n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        var add = new Scanner(in);
            int in = add.nextInt();
            out.println(in+"=="+fib(in));
    }
}
