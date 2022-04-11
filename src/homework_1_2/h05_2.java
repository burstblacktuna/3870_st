package homework_1_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class h05_2 extends JFrame {
    static JTextArea t1, t2;
    static JButton b1;
    static h05_1 f = new h05_1();
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        t1 = new JTextArea(null,6,8);
        t2 = new JTextArea(null,6,8);
        b1 = new JButton("Clear");
        f.add(t1);f.add(t2);f.add(b1);
        b1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
                t2.setText(null);
            }
        });
        f.setSize(200, 180);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }
}