package com.text;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 流式布局
 */
public class Text4 extends JFrame{

	private static final long serialVersionUID = 1291882347054811159L;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		   Text4 jf=new Text4();
		   jf.setVisible(true);
	}
	public Text4()
	  {
 	    jb1=new JButton("1");
	    jb2=new JButton("2");
	    jb3=new JButton("3");
 	    jb4=new JButton("4");
 	    jb5=new JButton("5");
 	    jb6=new JButton("6");
 	    jb7=new JButton("7");
 	    jb8=new JButton("8");
 	    jb9=new JButton("9");
 	    jb10=new JButton("0");
 	    jb11=new JButton("+");
 	    jb12=new JButton("=");
 	    
 	    this.setLayout( new FlowLayout(FlowLayout.LEFT) );
 	    this.add(jb1);
 	    this.add(jb2);
 	    this.add(jb3);
 	    this.add(jb4);
	    this.add(jb5);
	    this.add(jb6);
	    this.add(jb7);
 	    this.add(jb8);
 	    this.add(jb9);
 	    this.add(jb11);
 	    this.add(jb10);
 	    this.add(jb12);

 	    this.setTitle("Window");
 	    this.setSize(160, 175);
 	    this.setLocationRelativeTo(null);
 	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    
	  }
}
