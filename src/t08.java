
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class t08 extends JFrame implements ActionListener, CaretListener {
    JTextField t1,t2;
    JButton b1;
    Container c;

    public t08() {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.blue);
        t1=new JTextField("YALLOW");
        t2=new JTextField("  RED ");
        b1=new JButton("Btn");
        c.add(t1); c.add(t2); c.add(b1);
        t1.addActionListener(this);
        b1.addActionListener(this);
        t1.addCaretListener(this);
        setTitle("EVENT");
        setSize(600, 450);
        setVisible(true);
    }

    public static void main(String[] args) {
        t08 frm = new t08();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    public void caretUpdate(CaretEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        t1.setText(t2.getText());

    }
}