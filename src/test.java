import java.util.Scanner;
import static java.lang.System.*;

public class test {
    public static void main(String[] args) {
        while (true) {
            var a = new Scanner(in);
            var x = a.nextLine();
            x = x.toLowerCase();
            var c = x.charAt(0);
            var n = c - 96;
                if (n == -48){out.print("end");break;}
            out.println(x+"為第"+n+"個字母");
        }
    }

    public static class t3 {
        public static void main(String[] args) {
            Scanner a = new Scanner(in);
            int x = a.nextInt();
            int y = a.nextInt();
            out.println(x + y);

        }
    }
}
