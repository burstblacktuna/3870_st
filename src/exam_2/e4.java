package exam_2;

import java.awt.*;
import javax.swing.*;

public class e4 extends JFrame {
    static JTextArea txt1, txt2, txt3, txt4;
    static JButton btn;
    static e4 f = new e4();
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        txt1 = new JTextArea("50");
        txt2 = new JTextArea("30");
        txt3 = new JTextArea("20");
        txt4 = new JTextArea("");
        btn = new JButton("Sum");
        f.add(txt1);f.add(txt2);f.add(txt3);f.add(txt4);f.add(btn);
        btn.addActionListener(e ->
            txt4.setText(String.valueOf(
                Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText()) + Integer.parseInt(txt3.getText())
            )));
        f.setTitle("EVENT");
        f.setSize(800, 600);
        f.setVisible(true);
    }
}