package school;
import java.util.Scanner;
import static java.lang.System.*;

public class s4 {
    public static void main(String[] args) {
        var scn = new Scanner(in);
        int input, i, pw = 6128;
        for (i = 1; i <= 3; i++) {
            out.println("請輸入密碼:");
            input = scn.nextInt();
            if (input == pw) {
                out.println("密碼正確，歡迎進入本系統!");
                break;
            } else {
                out.println("密碼不正確，重新輸入\n");
            }
            if (i == 3) out.println("密碼輸入超過三次!");
        }
    }
}
