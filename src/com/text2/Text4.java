package com.text2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;


/**
 * 
 * @author ��˴
 * ��ͼ
 */
import javax.swing.*;
public class Text4 extends JFrame{

	private static final long serialVersionUID = -9081593635023557204L;

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Text4 jf = new Text4();
		jf.setVisible(true);
	}
    public void paint(Graphics g)
    {
//    	super.paint(g);
    	g.setColor(Color.orange);
  	    g.fill3DRect(80, 80, 40, 40, true);
   	    g.setColor(Color.green);
    	g.fillOval(280, 150, 100, 80);
    	//��
    	g.setColor(Color.red);
    	g.setFont(new Font("����", Font.BOLD, 30));
    	g.drawString("����֮��", 140, 100);
    	//ͼƬ����
    	Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/LOL.jpg"));
    	g.drawImage(im,140,120,120,170,this);
    	g.drawArc(100, 100, 100, 200, 0, -150);
    }
    public Text4()
    {
    	this.setTitle("��ͼ");
    	this.setSize(400, 400);
    	this.setLocationRelativeTo(null);
    	this.setBackground(Color.white);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
