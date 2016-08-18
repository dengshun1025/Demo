package com.text;
//import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 界面
 * 1.继承JFrame
 * 2.定义组件
 * 3.构造函数
 * 4.窗口
 * 5.创建组件
 * 6.设置布局管理器
 * 7.添加组件
 */
public class Text2 extends JFrame{
	    
	      private static final long serialVersionUID = 8692740710300361974L;
	    
		  JButton jb1=new JButton("按钮");
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
