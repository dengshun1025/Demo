package com.text;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 网格布局
 */
public class Text5 extends JFrame{

	int size=9;
	JButton jb[ ]=new JButton[size]; 
	private static final long serialVersionUID = -7936464742850316305L;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Text5 jf=new Text5();
        jf.setVisible(true);
	}
   public Text5()
   {
	   for(int i=0;i<size;i++)
	   {
		   jb[i]=new JButton(String.valueOf(i+1));
	   }
	   this.setLayout(new GridLayout(3,3,5,5));
	   for(int i=0;i<size;i++)
	   {
		   this.add(jb[i]);
	   }

	   this.setTitle("Window");
	   this.setSize(200, 200);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
   }
}
