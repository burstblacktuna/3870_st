import static java.lang.System.*;

public class t05 {
    public static void main(String[] args) {
        char ch1 = '\u0041';
        out.println("ch1:" + ch1);
        for (int i=1;i>0;i--) {
            out.println(i);
        }
        // 建立含有 10 個整數的陣列
        int[] a = new int[10];
        // 初始化陣列元素
        int v = 10;
        for (int i = 0; i < 10; i++) {
            a[i] = v--;
        }
        // 利用 for 迴圈印出每一個元素
        for (int i : a) {
            out.println(i);
        }
    }
}
