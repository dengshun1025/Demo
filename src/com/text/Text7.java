package com.text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * @author ��˴
 *  ��½���� �� ���¼�����
 */
public class Text7 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 8562711614334592727L;
    JPanel jp1,jp2,jp3;
    JLabel jl1,jl2;
    JButton jb1,jb2;
    JTextField jtf1;
    JPasswordField jtf2;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
         Text7 jf=new Text7();
         jf.setVisible(true);
	}
    public Text7()
    {
	   	    jp1=new JPanel();
	   	    jp2=new JPanel();
	   	    jp3=new JPanel();
	   	    jl1=new JLabel("�˺�");
	   	    jl2=new JLabel("����");
	   	    jb1=new JButton("��½");
	   	    jb2=new JButton("�˳�");
	   	    jtf1=new JTextField(12);
	   	    jtf2=new JPasswordField(12);
	   	    
	   	    
	   	    this.setLayout(new GridLayout(3,1));
	   	    jp1.add(jl1);
	   	    jp1.add(jtf1);
	   	    jp2.add(jl2);
	   	    jp2.add(jtf2);
	   	    jp3.add(jb1);
	   	    jp3.add(jb2);
	   	    this.add(jp1);
	   	    this.add(jp2);
	   	    this.add(jp3);
	   	   
	   	    jb2.addActionListener(this);

    	    this.setTitle("�û���½    ");
	   	    this.setSize(300, 150);
	   	    this.setResizable(false);
	   	    this.setLocationRelativeTo(null);
	   	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	    
    }
    public void actionPerformed(ActionEvent e)
    {
    	System.exit(0);
    }
} 
