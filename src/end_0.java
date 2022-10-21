import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class end_0 extends Frame implements MouseListener,ActionListener {
    static end_0 frm = new end_0();
    static JButton b,c;
    int x1, y1;
    int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int i = 0;
    public static void main(String[] args) {
        frm.setLayout(new FlowLayout());
        frm.setSize(300, 250);
        b = new JButton("polygon");
        c = new JButton("clear");
        frm.add(b);frm.add(c);
        b.addActionListener(frm);
        c.addActionListener(frm);
        frm.setVisible(true);
        frm.addMouseListener(frm);
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                frm.dispose();
            }
        });
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();y1 = e.getY();
        Graphics g = getGraphics();
        x[i] = x1;y[i] = y1;
        g.drawOval(x1, y1, 3, 3);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y)+"\n");
        i++;
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn==b){
            Graphics g = getGraphics();
            g.drawPolygon(x,y,i);

        }
        else  {
            repaint();
        }
        Arrays.fill(x,0);
        Arrays.fill(y,0);
        i=0;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y)+"\n");

    }

    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {

    }

}