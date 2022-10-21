import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.*;

public class Test12 extends JApplet implements MouseMotionListener {
    JButton goButton;
    private int cx=250,cy=250;
    int h,w;
    JPanel bPanel,centerPanel;
    public void init() {
        setLayout(new BorderLayout());
        goButton = new JButton("Do it again!");
        bPanel = new JPanel();
        bPanel.add(goButton);
        add(bPanel,BorderLayout.NORTH);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1,2));
        add("Center", centerPanel);
        addMouseMotionListener(this);
    }
    public void paint(Graphics g) {
        g=centerPanel.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString(String.format("(%d,%d)", cx, cy) , cx, cy);

    }
    public void setMouseCoordinate(int x, int y){
        cx=x;
        cy=y;
    }
    public void mouseMoved( MouseEvent e ) {
        setMouseCoordinate(e.getX(),e.getY());
        repaint();
    }
    public void mouseDragged( MouseEvent e ) {
    }
    public static void main(String argv[]) {
        final Test12 demo = new Test12();
        demo.init();
        JFrame f = new JFrame("Java 2D(TM) Demo - Test12");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        f.getContentPane().add("Center", demo);
        f.pack();
        f.setSize(new Dimension(800,600));
        f.show();
    }
}