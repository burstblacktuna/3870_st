package homework;

import java.text.DecimalFormat;

import static java.lang.System.*;

public class h8_2 {
    public static void main(String[] args) {
        int[][] amount = {
                {33, 32, 56, 45, 33},
                {77, 33, 68, 45, 23},
                {43, 55, 43, 67, 65}};
        String[] product = {"產品A", "產品B", "產品C", "產品D", "產品E"};
        int[] price = {12, 16, 10, 14, 15};
        String[] salesman = {"1", "2", "3"};
        var comma = new DecimalFormat(",###");
        //印出第一排
        out.print("銷售員");
        for (String i : product) {
            out.print("\t" + i);
        }
        out.print("\t總額\n");
        //
        String maxman = null;
        int max1 = 0;
        for (int i = 0; i < amount.length;
             i++) {
            int sum = 0;
            out.print(salesman[i] + "\t\t");
            for (int j = 0; j < amount[i].length; j++) {
                sum += amount[i][j] * price[j];
                out.print(amount[i][j] + "\t\t");
            }
            if (sum > max1) {
                max1 = sum;
                maxman = salesman[i];
            }
            out.print(comma.format(sum) + "\t\n");
        }
        //
        String maxproduct = null;
        int max2 = 0;
        int[] productsum = {0, 0, 0, 0, 0};
        out.print("總額");
        for (int[] i : amount) {
            for (int j = 0; j < i.length; j++) {
                productsum[j] += i[j] * price[j];
                if (productsum[j] > max2) {
                    max2 = productsum[j];
                    maxproduct = product[j];
                }
            }
        }
        for (int i : productsum) out.print("\t" + comma.format(i));
        //
        out.print("\t單位(元)");
        out.println("\n業績最好銷售員為:" + maxman);
        out.println("銷售最好產品為:" + maxproduct);
    }
}
