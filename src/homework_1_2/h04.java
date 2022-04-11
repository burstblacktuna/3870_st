package homework_1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.FlowLayout.LEFT;

public class h04 extends JFrame implements ActionListener {
    static h04 frm;
    JRadioButton btn1,btn2;
    Container c;
    ButtonGroup g;
    public h04() {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        g = new ButtonGroup();
        btn1 = new JRadioButton("YELLOW");
        btn2 = new JRadioButton("RED");
        g.add(btn1);g.add(btn2);add(btn1);add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setTitle("EVENT");
        setSize(600, 450);
        setVisible(true);
    }
    public static void main(String[] args) {
        frm = new h04();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);}});
    }
    public void actionPerformed(ActionEvent e) {
        JRadioButton btn = (JRadioButton) e.getSource();
        if (btn == btn1) {
            c.setBackground(Color.yellow);
            c.setLayout(new FlowLayout(LEFT));
        }

        else if (btn == btn2) {
            c.setBackground(Color.red);
            c.setLayout(new FlowLayout(FlowLayout.RIGHT));
        }
        else c.setBackground(Color.red);
    }
}