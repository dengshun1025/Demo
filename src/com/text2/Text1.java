package com.text2;//�������ͼ
import javax.swing.*;

import java.awt.*;
/**
 * 
 * @author ��˴
 * qq��½����
 */
public class Text1 extends JFrame{

	private static final long serialVersionUID = -5731749433674549524L;
    //north
	JPanel jp4;
	//center
	JTabbedPane jtp;  //ѡ�����
	
	JCheckBox jcb1,jcb2;
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2,jlb3,jlb4;
	JButton jb;
	JTextField jtf;
	JPasswordField jpf;
	//south
	JButton jb1,jb2,jb3;
	JPanel jp;
	
	public Text1() {
		   //new
		   jp4=new JPanel( );
		   jp4.setSize(300, 50);
		   jtp=new JTabbedPane();
		   jcb1=new JCheckBox("�����½");
		   jcb2=new JCheckBox("��ס����");
		   jp1=new JPanel();
		   jp2=new JPanel();
		   jp3=new JPanel();
		   jlb1=new JLabel("qq�˺�",JLabel.CENTER);
		   jlb2=new JLabel("qq����",JLabel.CENTER);
		   jlb3=new JLabel("��������",JLabel.CENTER);
		   jlb4=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>",JLabel.CENTER);
		   jb=new JButton("�������");
		   jtf =new JTextField(12);
		   jpf=new JPasswordField(12);
		   jb1=new JButton("��½�˺�");
		   jb2=new JButton("ȡ����½");
		   jb3=new JButton("��������");
		   jp=new JPanel();
		   //add
		   jp.add(jb1);
		   jp.add(jb2);
		   jp.add(jb3);
		   jp1.setLayout(new GridLayout(3,3));
		   jp1.add(jlb1);
		   jp1.add(jtf);
		   jp1.add(jb);
		   jp1.add(jlb2);
		   jp1.add(jpf);
		   jp1.add(jlb3);
		   jp1.add(jcb1);
		   jp1.add(jcb2);
		   jp1.add(jlb4);
		   //ѡ�
		   jtp.add("qq����",jp1);
		   jtp.add("��������",jp2);
		   jtp.add("�ֻ�����",jp3);
		   //
		   this.add(jp4,BorderLayout.NORTH);
		   this.add(jtp,BorderLayout.CENTER);
		   this.add(jp,BorderLayout.SOUTH);
		   
		   this.setTitle("��Ѷqq");
		   this.setSize(300, 200);
		   this.setIconImage(null);
		   this.setResizable(false);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
     Text1 jf=new Text1();
     jf.setVisible(true);
	}

}
