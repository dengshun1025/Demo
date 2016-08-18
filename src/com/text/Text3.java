package com.text;
import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author µËË´
 * ±ß½ç²¼¾Ö
 */

public class Text3 extends JFrame{

	private static final long serialVersionUID = 475521414492059653L;
    JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String []args)
	{
		Text3 jf=new Text3();
		jf.setVisible(true);
	}
	public Text3()
	  {
   	    jb1=new JButton("c");
   	    jb2=new JButton("e");
   	    jb3=new JButton("w");
   	    jb4=new JButton("s");
   	    jb5=new JButton("n");
   	    
   	    this.add(jb1,BorderLayout.CENTER);
   	    this.add(jb2,BorderLayout.EAST);
   	    this.add(jb3,BorderLayout.WEST);
   	    this.add(jb4,BorderLayout.SOUTH);
   	    this.add(jb5,BorderLayout.NORTH);
   	    
   	    this.setTitle("Window");
   	    this.setSize(300, 200);
   	    this.setLocationRelativeTo(null);
   	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	    
	  }
}
