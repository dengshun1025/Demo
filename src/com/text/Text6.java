package com.text;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * JPanel.
 */
public class Text6 extends JFrame{

	private static final long serialVersionUID = -3358925080386577302L;
    
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
          Text6 jf=new Text6();
          jf.setVisible(true);
	}
    public Text6()
    {
	   	    jp1=new JPanel();
	   	    jp2=new JPanel();
	   	    
	   	    jb1=new JButton("西瓜");
	   	    jb2=new JButton("香蕉");
	     	jb3=new JButton("葡萄");
	    	jb4=new JButton("橘子");
	    	jb5=new JButton("苹果");
	    	jb6=new JButton("荔枝");
	    	
	    	jp1.add(jb1);
	    	jp1.add(jb2);
	    	jp2.add(jb3);
	    	jp2.add(jb4);
	    	jp2.add(jb5);
	    	
	    	this.add(jp1,BorderLayout.NORTH);
	    	this.add(jb6,BorderLayout.CENTER);
	    	this.add(jp2,BorderLayout.SOUTH);

    	    this.setTitle("Window");
	   	    this.setSize(300, 200);
	   	    this.setResizable(true);
	   	    this.setLocationRelativeTo(null);
	   	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	    
    }
}
