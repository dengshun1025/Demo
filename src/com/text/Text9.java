package com.text;
import java.awt.*;

import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 下拉框，列表框，滚动窗
 */
public class Text9 extends JFrame{

	private static final long serialVersionUID = 4838571282133707298L;
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox<String> jcb1;
	JList<String> jlt;
	JScrollPane jsp;
	
	public Text9()
	{
		   jp1=new JPanel();
	  	   jp2=new JPanel();
	  	    
	  	   jl1=new JLabel("籍    贯");
	  	   jl2=new JLabel("居住地");
	  	   
	  	   String[ ]  jg={"北京","上海","南京","武汉","香港","天津"};
	  	   jcb1=new JComboBox<>(jg);
	  	   
	  	 String[ ]  ct={"北京","上海","南京","武汉","天津"};
	  	  jlt= new JList<>(ct);
	  	  jlt.setVisibleRowCount(3);
	  	  jsp=new JScrollPane(jlt);
	  	  
	  	  this.setLayout(new GridLayout(2,1));
	  	  jp1.add(jl1);
	  	  jp1.add(jcb1);
	  	  jp2.add(jl2);
	  	  jp2.add(jsp);
	  	  
	  	  this.add(jp1);
	  	  this.add(jp2);

		   this.setTitle("选择框   ");
		   this.setSize(300, 300);
		   this.setResizable(false);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Text9 jf=new Text9();
		jf.setVisible(true);
	}

}
