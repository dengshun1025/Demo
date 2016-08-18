
package com.demo;
//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.Calendar;
;

/**
 * author: shun
 * 功能：排序！
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int len=100000;
		int ar[]=new int[len];
		for(int j=0;j<len;j++)
		{
			int x=(int)(Math.random()*1000);
			ar[j]=x;
		}
	    Calendar cal;
     
     //冒泡
     //Bubble a=new Bubble();
     
     //选择
     //Select b=new Select();
    
     //插入
     Insert c=new Insert();
     
     //快速
     //Quick d=new Quick();
     
     //时间
     
     cal=Calendar.getInstance();  
     System.out.println(cal.getTime());
     c.insert(ar);
     //Arrays.sort(ar);//  调用Java中已经实现的方法排序（快速排序法）。
     cal=Calendar.getInstance();
     System.out.println(cal.getTime());
   /*  b.select(ar);
     cal=Calendar.getInstance();
     System.out.println(cal.getTime());
     c.insert(ar);
     cal=Calendar.getInstance();
     System.out.println(cal.getTime());
     d.quickSort(ar, 0, ar.length-1); 
     cal=Calendar.getInstance();
     System.out.println(cal.getTime());
     for(int i=0;i<ar.length;i++)
     {
    	 System.out.print("  "+ar[i]);
     }
	  System.out.println(" ");*/
     
	}

}
//冒泡
class Bubble
{
	public void bubble(int[] ar)
	{
		 int temp=0;
		 for(int i=0;i<ar.length-1;i++)
	        for(int j=0;j<ar.length-1-i;j++)
	    	   if(ar[j]>ar[j+1])
	    		 {
	    			 temp=ar[j];
	    			 ar[j]=ar[j+1];
	    			 ar[j+1]=temp;
	    		 }
	}
}
//选择
class Select
{
	public void select(int[] ar)
	{
		int temp=0;
		for(int i=0;i<ar.length-1;i++)
		{
			int min=ar[i];
			int minx=i;
			
			for(int n=i+1;n<ar.length;n++)
			{
				if(min>ar[n])
				{
					min=ar[n];
					minx=n;
				}
			}
			temp=ar[i];
			ar[i]=ar[minx];
			ar[minx]=temp;
		}
	}
}
//插入
class Insert
{
	public void insert(int[] ar)
	{
		for(int i=1;i<ar.length;i++)
		{
			int val=ar[i];
			int x=i-1;
			while(x>=0&&ar[x]>val)
			{
				ar[x+1]=ar[x];
				x--;
			}
			ar[x+1]=val;
		}
	}
}
//快速
class Quick
{
	public void quickSort(int a[],int start,int end)
	{
	int i=start,j=end;
	if((a==null)||(a.length==0))
	return;
	while(i<j)
	{
	while(i<j&&a[i]<=a[j])
	{
		//以数组start下标的数据为key，右侧扫描
		j--;
	}
	if(i<j)
	{
		//右侧扫描，找出第一个比key小的，交换位置
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	while(i<j&&a[i]<a[j])
	{
		//左侧扫描（此时a[j]中存储着key值）
		i++;
	}
	if(i<j)
	{
		//找出第一个比key大的，交换位置
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
	if(i-start>1)
	{
		//递归调用，把key前面的完成排序
		quickSort(a,start,i-1);
	}
	if(end-i>1)
	{
		quickSort(a,i+1,end); //递归调用，把key后面的完成排序
	}
	}
}
