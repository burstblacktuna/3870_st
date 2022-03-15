import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;


public class t07 extends Frame implements ActionListener {
    static t07 frm=new t07();
    static Button btn=new Button("Chick me");
    static Canvas cv=new Canvas();

    public static void main(String[] args) {
        btn.addActionListener(frm);
        frm.setLayout(new FlowLayout());
        frm.setTitle("Action Event");
        frm.setBackground(Color.blue);
        frm.setSize(200,220);
        frm.add(btn);
        frm.add(cv);
        frm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        frm.setBackground(Color.blue);

    }
    public void paint(Graphics g){
        g.translate(30,40);
        for (int i =0;true;i++){
            g.setColor(Color.blue);
            g.fillArc(20, 30, 100, 100, 30, 360);
            g.setColor(Color.orange);
            g.fillArc(20, 30, 100, 100, 30, 290);
            g.setColor(Color.black);
            g.fillOval(55,50,11,11);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.setColor(Color.orange);
            g.fillArc(20, 30, 100, 100, 30, 325);
            g.setColor(Color.black);
            g.fillOval(55,50,11,11);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.setColor(Color.orange);
            g.fillArc(20, 30, 100, 100, 30, 360);
            g.setColor(Color.black);
            g.fillOval(55,50,11,11);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
