import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Simple1 {
    private static JFrame frame; // 定義為靜態變數以便main使用
    private static JPanel myPanel; // 該面板用來放置按鈕元件
    private JButton button1; // 這裡定義按鈕元件
    private JButton button2; // 以便讓ActionListener使用

    public Simple1() // 構造器, 建立圖形介面
    {   // 新建面板
        myPanel = new JPanel();
        // 新建按鈕
        button1 = new JButton("按鈕1"); // 新建按鈕1
        button2 = new JButton("按鈕2");

        SimpleListener ourListener = new SimpleListener();
        // 建立一個actionlistener讓兩個按鈕共享
        button1.addActionListener(ourListener);
        button2.addActionListener(ourListener);

        myPanel.add(button1); // 新增按鈕到面板
        myPanel.add(button2);
    }

    private class SimpleListener implements ActionListener {
        /**
         * 　　 * 利用該內部類來監聽所有事件源產生的事件
         * 　    　 * 便於處理事件程式碼模組化
         */
        public void actionPerformed(ActionEvent e) {
            // 利用getActionCommand獲得按鈕名稱
            // 也可以利用getSource()來實現
            // if (e.getSource() ==button1)

            String buttonName = e.getActionCommand();
            if (buttonName.equals("按鈕1"))
                JOptionPane.showMessageDialog(frame,
                        "按鈕1 被點選");
            else if (buttonName.equals("按鈕2"))
                JOptionPane.showMessageDialog(frame,
                        "按鈕2 被點選");
            else
                JOptionPane.showMessageDialog(frame,
                        "Unknown event");
        }
    }

    public static void main(String s[]) {
        Simple1 gui = new Simple1(); // 新建Simple1元件

        frame = new JFrame("Simple1"); // 新建JFrame
        // 處理關閉事件的通常方法
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.getContentPane().add(myPanel);
        frame.pack();
        frame.setVisible(true);
    }
}