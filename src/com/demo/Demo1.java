package com.demo;

/**
 * idea
 * 入门，数组，排序，查找等基本方法
 */
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
		// TODO 自动生成的方法存根
   		new Demo1();
	}

}
