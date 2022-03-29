package school;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class s11 extends JFrame implements ActionListener, CaretListener {
    JTextField t1,t2;
    Container c;

    public s11() {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.blue);
        t1=new JTextField("YALLOW");
        t2=new JTextField("  RED ");
        c.add(t1); c.add(t2);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t1.addCaretListener(this);
        setTitle("EVENT");
        setSize(600, 450);
        setVisible(true);
    }

    public static void main(String[] args) {
       s11 frm = new s11();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    public void caretUpdate(CaretEvent e) {
        t2.setText(t1.getText());
    }

    public void actionPerformed(ActionEvent e) {

    }
}