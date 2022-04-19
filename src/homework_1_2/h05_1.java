package homework_1_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.awt.FlowLayout.*;


public class h05_1 extends JFrame {
    static JCheckBox l, c, r;
    static ButtonGroup g;
    static h05_1 f= new h05_1();

    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        g = new ButtonGroup();
        l = new JCheckBox("Left");
        c = new JCheckBox("Center");
        r = new JCheckBox("Right");
        g.add(l);g.add(c);g.add(r);
        f.add(l);f.add(c);f.add(r);
        l.addItemListener(listener);
        c.addItemListener(listener);
        r.addItemListener(listener);
        f.setSize(600, 450);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }
    static ItemListener listener = new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
            if (l.isSelected()) f.setLayout(new FlowLayout(LEFT));
            else if (c.isSelected()) f.setLayout(new FlowLayout(CENTER));
            else if (r.isSelected())f.setLayout(new FlowLayout(RIGHT));
            f.setVisible(true);
        }
    };
}