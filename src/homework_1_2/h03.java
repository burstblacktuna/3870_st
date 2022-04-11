package homework_1_2;

import java.awt.*;
import java.awt.event.*;

public class h03 extends Frame implements ActionListener {
    static h03 frm = new h03();
    static Button btn = new Button("Chick me");
    static int c = 1;

    public static void main(String[] args) {
        btn.addActionListener(frm);
        frm.setLayout(new FlowLayout());
        frm.setTitle("background=white");
        frm.setSize(300, 300);
        frm.add(btn);
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }});
    }

    public void actionPerformed(ActionEvent e) {
        if (c == 0) {
            frm.setBackground(Color.white);
            frm.setLayout(new FlowLayout(FlowLayout.LEFT));
            frm.setTitle("background=white");
            c = 1;
        }
        else {
            frm.setBackground(Color.yellow);
            frm.setTitle("background=yellow");
            c = 0;
        }
    }
}