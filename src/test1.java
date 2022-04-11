
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class test1 extends JFrame implements ActionListener {
    static test1 frm;
    JRadioButton btn1,btn2;
    Container c;
    ButtonGroup g;
    public test1() {
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
        frm = new test1();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);}});
    }
    public void actionPerformed(ActionEvent e) {
        JRadioButton btn = (JRadioButton) e.getSource();
        if (btn == btn1) c.setBackground(Color.yellow);
        else if (btn == btn2) c.setBackground(Color.red);
        else c.setBackground(Color.red);
    }
}