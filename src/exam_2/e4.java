package exam_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class e4 extends JFrame implements KeyListener{
    static JTextArea t1, t2,t3,t4;
    static JButton b1;
    static e4 f = new e4();
    static int c1,c2,c3;
    public static void main(String[] args) {
        f.setLayout(new FlowLayout());
        t1 = new JTextArea("11",6,8);
        t2 = new JTextArea("22",6,8);
        t3 = new JTextArea("33",6,8);
        t4 = new JTextArea(null,6,8);
        b1 = new JButton("Sum");
        f.add(t1);f.add(t2);f.add(t3);f.add(t4);
        f.add(b1);
        t4.addKeyListener(f);
        b1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int s1= Integer.parseInt(t1.getText());
                int s2= Integer.parseInt(t2.getText());
                c1= Integer.parseInt (String.valueOf(s1));
                c2= Integer.parseInt (String.valueOf(s2));
                t3.setText(String.valueOf(c1+c2));
            }
        });
        f.setSize(800, 600);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }
    public void keyReleased(KeyEvent e) {

        int key;
        key=e.getKeyCode();
        if(key==10)
        {
            System.out.print("test");
            int s1= Integer.parseInt(t1.getText());
            int s2= Integer.parseInt(t2.getText());
            int s3= Integer.parseInt(t3.getText());
            c1= Integer.parseInt (String.valueOf(s1));
            c2= Integer.parseInt (String.valueOf(s2));
            c3= Integer.parseInt (String.valueOf(s3));
            t4.setText(String.valueOf(c1+c2+c3));
        }
    }
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }


}