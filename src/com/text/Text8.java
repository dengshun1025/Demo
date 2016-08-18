package com.text;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 单选框与复选框
 */
public class Text8 extends JFrame{

	private static final long serialVersionUID = -4589253634538264345L;
    
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     Text8 jf=new Text8();
     jf.setVisible(true);
	}
   public Text8()
   {
	    jp1=new JPanel();
  	    jp2=new JPanel();
  	    jp3=new JPanel();
  	    
  	    jb1=new JButton("注册");
 	    jb2=new JButton("取消");
 	     
 	    jl1=new JLabel("喜欢的明星");
  	    jl2=new JLabel("性别");
  	    
  	    jcb1=new JCheckBox("刘亦菲");
  	    jcb2=new JCheckBox("刘诗诗");
  	    jcb3=new JCheckBox("林志玲");
  	    
  	    jrb1=new JRadioButton("男");
  	    jrb2=new JRadioButton("女");
  	    
  	    bg=new ButtonGroup();
  	    
  	    this.setLayout(new GridLayout(3,1));
  	    
  	    jp1.add(jl1);
  	    jp1.add(jcb1);
        jp1.add(jcb2);
    	jp1.add(jcb3);
        
        bg.add(jrb1);
        bg.add(jrb2);
        
        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        
        jp3.add(jb1);
        jp3.add(jb2);
        
  	    this.add(jp1);
  	    this.add(jp2);
  	    this.add(jp3);

 	   this.setTitle("用户注册   ");
 	   this.setSize(300, 150);
 	   this.setResizable(false);
 	   this.setLocationRelativeTo(null);
 	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	   
   }
   
}
