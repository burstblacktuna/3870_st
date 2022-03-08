package homework_1_1;
import java.util.Scanner;
import static java.lang.System.*;

public class h03 {
    public static void main(String[] args) {
        //輸入整數，輸出絕對值與判斷奇偶數
        var a = new Scanner(in);
        var x = a.nextInt();
        if (x > 0)
            out.println(x);//正整數則輸出不變
        else
            out.println(-x);//負整數則輸出為負
        if (x % 2 == 0)
            out.println("偶數");//除以2餘數為0
         else
            out.println("奇數");//除以2餘數為1
    }
}