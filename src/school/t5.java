package school;
import static java.lang.System.*;

public class t5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++)//縱軸印出5次
        {
            for (int w = 1; w <= i; w++)//i每執行一次，w多印一次
            {
                out.println(w);
            }
        }
    }
}