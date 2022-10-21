import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test11 extends JApplet implements MouseMotionListener{
    myCanvas drawingArea;
    JButton goButton;
    JPanel bPanel,centerPanel;
    public void init() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        goButton = new JButton("Do it again!");
        bPanel = new JPanel();
        bPanel.add(goButton);
        contentPane.add(bPanel,BorderLayout.NORTH);
        centerPanel = new JPanel();
        centerPanel.setBounds(0,0,800,600);
        centerPanel.setLayout(new GridLayout(1,2));
        drawingArea = new myCanvas();
        centerPanel.add(drawingArea);
        contentPane.add(centerPanel,BorderLayout.CENTER);
        addMouseMotionListener(this); //drawingArea.addMouseMotionListener(this);
    }
    public void mouseMoved( MouseEvent e ) {
        drawingArea.setMouseCoordinate(e.getX(),e.getY());
        repaint();
        drawingArea.repaint();
    }
    public void mouseDragged( MouseEvent e ) {
    }
    public static void main(String argv[]) {
        final Test11 demo = new Test11();
        demo.init();
        JFrame f = new JFrame("Java 2D(TM) Demo - Test11");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        f.getContentPane().add("Center", demo);
        f.pack();
        f.setSize(new Dimension(800,600));
        f.show();
    }
}
class myCanvas extends Canvas{
    int cx=250,cy=250;
    Graphics2D g2;
    public void setMouseCoordinate(int x, int y){
        this.cx=x;
        this.cy=y;
    }
    public void paint(Graphics g) {
        g2 = (Graphics2D) g;
        g2.drawString(String.format("(%d,%d)", cx, cy) , cx, cy);
    }
}