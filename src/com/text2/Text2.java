package com.text2;
import javax.swing.*;
/**
 * 
 * @author 邓舜
 * 拆分窗格 JSplitpane
 */
public class Text2 extends JFrame{

	private static final long serialVersionUID = 6203361910065506938L;
    
	JSplitPane jsp;
	JList<String> jlt;
	JLabel jlb;
	public Text2()
	{		   
		String[] word={"boy","girl","cat","dog"};
		jlt=new JList<>(word);
		jlb=new JLabel();
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlt,jlb);
		jsp.setOneTouchExpandable(true);
		this.add(jsp);

		   this.setTitle("拆分窗格  ");
		   this.setSize(300, 300);
		   this.setResizable(false);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Text2 jf=new Text2();
		jf.setVisible(true);
	}

}
