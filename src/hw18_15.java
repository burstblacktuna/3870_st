// hw18_15,
import java.awt.*;
import java.awt.event.*;
public class hw18_15 extends Frame implements KeyListener,ActionListener
{
   static hw18_15 frm=new hw18_15();
   static Label lab1=new Label();
   static Label lab2=new Label();
   static Label lab3=new Label();
   static Button btn=new Button("Next");
   static TextField txf=new TextField(3);
   static int a,b;

   public static void main(String args[])
   {
      frm.setSize(200,150);
      frm.setTitle("Key Event");
      frm.setLayout(null);
      txf.setBounds(90,60,30,20);
      txf.addKeyListener(frm);
      lab1.setBounds(30,60,60,20);
      lab1.setAlignment(Label.RIGHT);
      lab2.setBounds(50,100,100,20);
      lab2.setAlignment(Label.CENTER);
      btn.setBounds(130,60,30,20);
      btn.addActionListener(frm);
      setNum();
      frm.add(btn);
      frm.add(lab1);
      frm.add(lab2);
      frm.add(txf);
      frm.setVisible(true);
   }

   public static void setNum()
   {
      a=(int)(100*Math.random());
      b=(int)(100*Math.random());
      lab1.setText(a+"+"+b+"=");
   }

   public void actionPerformed(ActionEvent e)
   {
      lab2.setBackground(Color.white);
      lab2.setText("");
      txf.setText("");
      setNum();
   }
   public void keyReleased(KeyEvent e)
   {
      String str="0";
      int sum;
      int key;

      str=txf.getText();
      key=e.getKeyCode();
      if(key==10)
      {
         sum=Integer.parseInt(str);
         if(a+b==sum)
         {
            lab2.setText("You are right!");
            lab2.setBackground(Color.yellow);
         }
         else
         {
            lab2.setText("Try it again!");
            lab2.setBackground(Color.pink);
         }
      }
   }
   public void keyPressed(KeyEvent e)
   { }
   public void keyTyped(KeyEvent e)
   { }
}
