package com.text2;
import  java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Text5 extends JFrame{

	private static final long serialVersionUID = -144176705276409227L;
	myPanel myPanel;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Text5 jf=new Text5();
		jf.setVisible(true);
	}
    public Text5() 
    {
    	myPanel=new myPanel();
    	this.add(myPanel);
    	this.addMouseListener(myPanel);
    	
    	this.setTitle("鼠标");
    	this.setSize(400, 300);
    	this.setResizable(false);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class myPanel extends JPanel implements MouseListener,KeyListener
{
	private static final long serialVersionUID = -4177144322193347241L;
	public void paint(Graphics g)
	{
		super.paint(g);
	}
	
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("  x="+arg0.getX()+"  y="+arg0.getY());
	}
	public void mouseEntered(MouseEvent arg0) {
		System.out.println(" 鼠标进入");
	}
	public void mouseExited(MouseEvent arg0) {
		System.out.println(" 鼠标离开");
	}
	public void mousePressed(MouseEvent arg0) {
		System.out.println(" 鼠标按下");
	}
	public void mouseReleased(MouseEvent arg0) {
		System.out.println(" 鼠标松开");
	}

	
	public void keyPressed(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}