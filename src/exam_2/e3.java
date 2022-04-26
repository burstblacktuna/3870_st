package exam_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class e3 extends JFrame {
    static JTextArea t1, t2, t3;
    static JButton b1;
    static e3 f = new e3();
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        t1 = new JTextArea("33", 6, 8);
        t2 = new JTextArea("22", 6, 8);
        t3 = new JTextArea(null, 6, 8);
        b1 = new JButton("Sum");
        f.add(t1);f.add(t2);f.add(t3);f.add(b1);
        b1.addActionListener(e ->
                t3.setText(String.valueOf(
                        Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())
                ))
        );
        f.setSize(800, 600);
        f.setVisible(true);
    }
}