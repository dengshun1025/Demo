package com.text;
//import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author ��˴
 * ����
 * 1.�̳�JFrame
 * 2.�������
 * 3.���캯��
 * 4.����
 * 5.�������
 * 6.���ò��ֹ�����
 * 7.������
 */
public class Text2 extends JFrame{
	    
	      private static final long serialVersionUID = 8692740710300361974L;
	    
		  JButton jb1=new JButton("��ť");
	      public static void main(String[ ] args)
	      {
	    	   Text2 jf=new Text2();
	  		   jf.setVisible(true);
	      }
	      public Text2()
  		  {

	  	    this.add(jb1);
	  	    
  	   	    this.setTitle("Window");
  	   	    this.setSize(300, 200);
  	   	    this.setLocationRelativeTo(null);
  	   	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		  }
}
