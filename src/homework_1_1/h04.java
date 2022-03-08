package homework_1_1;
import static java.lang.System.*;
public class h04 {
    public static void main(String[] args) {
        double l = 3500;//長度為3500
        for (int day = 1; true; day++) {
            l = l / 2;//每天減半
            out.println(l);
            if (l < 3) {//長度小於3就停止
                out.println("天數:" + day);//印出第幾天
                break;
            }
        }
        out.println();

        int sum = 0;//總和
        for (int i = 1; i <= 100; i++) {
            sum += i*i;//1²+2²+3+...100²
        }
        out.println("1到100平方總和:" + sum);

    }
}