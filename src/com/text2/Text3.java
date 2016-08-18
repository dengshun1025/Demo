package com.text2;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * 
 * @author 邓舜
 * qq 聊天框
 */
public class Text3 extends JFrame{

	private static final long serialVersionUID = 7179287634484460332L;
    JTextArea jta;
    JScrollPane jsp;
    JPanel jp;
    JComboBox<String> jcb;
    JTextField jtf;
    JButton jb;
    
    public Text3()
    { 
		   jta=new JTextArea();
		   jsp=new JScrollPane(jta);
		   jp=new JPanel();
		   String [] chatter={"boy","girl"};
		   jcb=new JComboBox<>(chatter);
		   jtf=new JTextField(12);
		   jb=new JButton("发送");
		   
		   jp.add(jcb);
		   jp.add(jtf);
		   jp.add(jb);
		   
		   this.add(jsp);
		   this.add(jp,BorderLayout.SOUTH);

    	   this.setTitle("qq");
		   this.setSize(300, 200);
		   this.setIconImage(null);
		   this.setResizable(false);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Text3 jf=new Text3();
      jf.setVisible(true);
	}

}
