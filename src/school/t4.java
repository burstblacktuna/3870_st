package school;

import static java.lang.System.*;

public class t4 {
    public static void main(String[] args) {
        int sum = 0;
        double sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 16 == 0) {
                out.println(i);
            }
        }
        out.println();

        for (int i = 1; i <= 100; i++) {
            sum = (int) (sum+Math.pow(i,2));

        }
        out.println("1到100平方總和:"+sum);

        for (int i = 0; i <= 5; i++) {
            for (int w = 1; w <= i; w++) {
                out.print(w);
            }
            out.println();
        }
        out.println();

        for (double i = 1; i <= 10; i++) {
            sum1=sum1+1/i;


        }
        out.println(sum1);

        int sum2=0;
        for (int i = 1; i <= 20; i++) {
            sum2 =sum2+i;
            out.println(i+"\t"+sum2);
            if(sum2>=100){
                out.println(">100 i="+i);
                break;
            }
        }

    }
}