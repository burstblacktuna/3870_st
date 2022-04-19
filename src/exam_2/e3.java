package exam_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class e3 extends JFrame {
    static JTextArea t1, t2,t3;
    static JButton b1;
    static e3 f = new e3();
    static int c1,c2;
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        t1 = new JTextArea("33",6,8);
        t2 = new JTextArea("22",6,8);
        t3 = new JTextArea(null,6,8);
        b1 = new JButton("Sum");
        f.add(t1);f.add(t2);f.add(t3);f.add(b1);
        b1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int s1= Integer.parseInt(t1.getText());
                int s2= Integer.parseInt(t2.getText());
                c1= Integer.parseInt (String.valueOf(s1));
                c2= Integer.parseInt (String.valueOf(s2));
                t3.setText(String.valueOf(c1+c2));
            }
        });
        f.setSize(800, 600);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }
}