import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;
import  javax.swing.event.*;
                                              //介面
public class q18_12 extends JFrame implements ActionListener, CaretListener{ //改Listener	
	JTextArea txt1 , txt2 ; // 改元件
	JButton btn;
	Container c;
	
	public q18_12() {
		c=getContentPane(); 
        c.setLayout(new FlowLayout());        
        c.setBackground(Color.yellow);
        txt1 = new JTextArea("YELLOW \n 222");  txt2 = new JTextArea("RED \r\n 333"); 
        btn=new JButton("BTN");
    	c.add(txt1); c.add(txt2);  c.add(btn); 
    	
    	btn.addActionListener(this);  //按鈕傾聽器        
        txt1.addCaretListener(this);        
		setTitle("EVENT");   setSize(800,600);  	setVisible(true);		
	}	
	
	public static void main(String[] args) { q18_12 frm= new q18_12();  }	
	public void actionPerformed(ActionEvent e) { txt1.setText("_");  txt2.setText("_");  	}	
	public void caretUpdate(CaretEvent e) { //抽象函數
		txt2.setText(txt1.getText()); //第2個文字方塊內容 設定setText 成 第1個文字方塊內容(getText) 
	}
	
}