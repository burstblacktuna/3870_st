package school;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class t3 {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入一個英文字母，不論大小寫");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        if (input.matches("[a-zA-Z]")) { // 判斷輸入的是不是字母，是就執行
            char word = input.charAt(0); // 取得輸入字串轉換成字元
            int number = word; // 將取得的字元轉換成Unicode碼
            int newnumber = 0;
            // System.out.println("你輸入的字母為:"+word+"\t它的英文順序是:"+number);
            if (input.matches("[A-Z]")) { // 利用正則表示式比對輸入的字元是不是大寫
                if ((65 >= number) || (number <= 90)) {
                    newnumber = (number - 65) + 1;
                    System.out.println("你輸入的字母為:" + word + "\t它的英文順序是:"
                            + newnumber);
                }
            }
            if (input.matches("[a-z]")) { // 利用正則表示式比對輸入的字元是不是小寫
                if ((97 >= number) || (number <= 122)) {
                    newnumber = (number - 97) + 1;
                    System.out.println("你輸入的字母為:" + word + "\t它的英文順序是:"
                            + newnumber);
                }
            }
        } else {
            System.out.print("輸入不正確，請重新輸入英文字母");
        }
    }

    }
