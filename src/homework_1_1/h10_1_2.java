package homework_1_1;

import java.util.Scanner;

import static java.lang.System.*;

public class h10_1_2 {
    public static long fib(int n){
        long[] num =new long[n];
        num[0]=1;
        if (n>1){
            num[1]=1;
            for (int i=2;i< n;i++)
                num[i]=num[i-1]+num[i-2];
        }
        return num[n-1];
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        var add = new Scanner(in);
        int in = add.nextInt();
        out.println(in+"=="+fib(in));
    }
}
