package com.demo;
/**
 * �˷���
 */
import java.util.Scanner;

public class Demo3 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������һ������");
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