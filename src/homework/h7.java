package homework;

import static java.lang.System.*;

public class h7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0, average;//設定總和及平均值
        //for (int i : A)此為執行陣列長度次數，i為陣列內容
        for (int i : A) {
            sum += i;
        }
        average = sum / A.length;//平均=總和÷個數
        for (int i : A) {
            if (i < average)//小於平均就印出
            {
                out.print(i + " ");
            }
        }
        out.println("");
        out.print("0");//0為任何數的因數
        int S=140;
        for (int i = 1; i <= S; i++)
        {
            if (S % i == 0)//沒有餘數就為因數
            {
                out.print("," + i);
            }
        }
    }
}