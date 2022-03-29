package school;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class s10 extends JFrame implements ActionListener {
    static s10 frm;
    JButton btn1;
    JButton btn2;
    Container c;

    public s10() {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        btn1 = new JButton("YELLOW");
        btn2 = new JButton("RED");
        c.add(btn1);
        c.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setTitle("EVENT");
        setSize(600, 450);
        setVisible(true);
    }


    public static void main(String[] args) {
        frm = new s10();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn == btn1) c.setBackground(Color.yellow);
        else if (btn == btn2) c.setBackground(Color.red);
        else c.setBackground(Color.red);
    }
}

