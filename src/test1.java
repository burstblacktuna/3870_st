import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test1 extends JFrame implements ActionListener {
    static test1 frm;
    JRadioButton btn1,btn2,btn3;//建立元件
    //JButton b1;//按鈕
    //JRadioButton b1;//選取按鈕
    //JCheckBox b1;//核取方塊
    //JTextArea t1;//文字方塊
    Container c;
    public test1() {
        c=getContentPane();
        //設定布局
        c.setLayout(new FlowLayout());
        //---------設定元件名字、長寬參數--------------
        btn1 = new JRadioButton("NAME1");
        btn2 = new JRadioButton("NAME2");
        btn3 = new JRadioButton("NAME3");
        //-----------------------------------------

        //-------------新增到視窗--------------------
        add(btn1);add(btn2);add(btn3);
        //-----------------------------------------

        //------------新增到點擊事件------------------
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        //-----------------------------------------

        setTitle("EVENT");//視窗設定標題
        setSize(600, 450);//設定視窗長寬
        setVisible(true);//設定視窗可見
    }
    public static void main(String[] args) {
        frm = new test1();
        frm.addWindowListener(new WindowAdapter() {//關閉視窗
            public void windowClosing(WindowEvent event) {
                System.exit(0);}});
    }
    public void actionPerformed(ActionEvent e) {
        //點擊事件
        JRadioButton btn = (JRadioButton) e.getSource();
        if (btn == btn1) {
            //元件按鈕一按下去後執行的程式
            c.setBackground(Color.yellow);
        }
        else if (btn == btn2) {
            //元件按鈕二按下去後執行的程式
            c.setBackground(Color.red);
        }
        else {
            //剩下元件按鈕按下去後執行的程式
            c.setBackground(Color.blue);
        }
    }
}