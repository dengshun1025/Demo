package com.demo;//����  �� ����  ������  �� ���� �Ȼ�������

import javax.swing.*;

@SuppressWarnings("serial")
public class Demo1 extends JFrame{

	private static final int WIDTH = 500;
	private static final int HEIGHT = 400;

	public Demo1()
	{
		this.setSize(WIDTH,HEIGHT);
		this.setUndecorated(false);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
   		new Demo1();
	}

}
