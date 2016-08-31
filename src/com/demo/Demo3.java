package com.demo;

/**
 * 乘法表
 */

import java.util.Scanner;

public class Demo3 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入一个数：");
		sc = new Scanner(System.in);
		int i = sc.nextInt();
        Aaa s=new Aaa();
        s.cfb(i);
	}

}

class Aaa
{
	public void cfb(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==3&&j==3||i==4&&j==3)
				System.out.print(" ");
				System.out.print(j+"*"+i+"="+i*j+"  ");
			}
			System.out.println(" ");
		}
	}
}