
/**
 * author: shun
 * 功能：查找！
 */
package com.demo;

public class Demo5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int len=10;
        int[] ar=new int[len];
        for(int i=0;i<len;i++)
        {
        	ar[i]=(int)(Math.random()*10);
        	System.out.print(ar[i]+"  ");
        }
        Sx sx=new Sx();
        System.out.println("下标为："+sx.sx(ar, 5));
	}

}
class Sx
{
	public int sx(int[] ar,int x)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==x)
			 return i;
		}
			 return -1;
	}
}
