package exam_2;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class e5 extends JFrame {
    static JTextArea t1, t2,t3,t4;
    static JButton b1;
    static e5 f = new e5();
    static int a,b,c,d;
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        t1 = new JTextArea(null,3,3);
        t2 = new JTextArea(null,3,3);
        t3 = new JTextArea(null,3,3);
        t4 = new JTextArea(null,3,3);
        b1 = new JButton("sort");
        f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(b1);
        b1.addActionListener(e -> {
            int[] arr = new int[]{a,b,c,d};
            Arrays.sort(arr);
            t1.setText(String.valueOf(arr[0]));
            t2.setText(String.valueOf(arr[1]));
            t3.setText(String.valueOf(arr[2]));
            t4.setText(String.valueOf(arr[3]));
        });
        setNum();
        f.setSize(600, 600);
        f.setVisible(true);
    }
    public static void setNum()
    {
        a=(int)(100*Math.random());
        b=(int)(100*Math.random());
        c=(int)(100*Math.random());
        d=(int)(100*Math.random());
        t1.setText(String.valueOf(a));
        t2.setText(String.valueOf(b));
        t3.setText(String.valueOf(c));
        t4.setText(String.valueOf(d));

    }


}