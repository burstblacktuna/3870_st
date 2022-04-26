package exam_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.awt.FlowLayout.*;


public class e2 extends JFrame {
    static JButton l, r;
    static e2 f= new e2();

    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        l = new JButton("靠左Jbutton");
        r = new JButton("靠右Jbutton");
        f.add(l);f.add(r);
        l.addActionListener(listener);
        r.addActionListener(listener);
        f.setSize(600, 450);
        f.setVisible(true);
    }
    static ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn==l) {f.setLayout(new FlowLayout(LEFT));}
            else if(btn==r){f.setLayout(new FlowLayout(RIGHT));}
            f.setVisible(true);
        }
    };
}