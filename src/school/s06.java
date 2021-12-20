package school;

import java.util.Scanner;

import static java.lang.System.*;

public class s06 {
    public static int fac(int n) {
        if(n==1) return 1;
        else return n*fac(n-1);
    }
    /*------------------------------------------------------------*/
    public static void main(String[] args) {
        var add = new Scanner(in);
        while (true){
            int n = add.nextInt();
            int sum =fac(n);
            out.println(n+"!=="+sum);
            for (int i = 1; i<n; i++){
                sum+=i;
            }
        }



    }
}
