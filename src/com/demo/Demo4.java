
package com.demo;
//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.Calendar;
;

/**
 * author: shun
 * ���ܣ�����
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int len=100000;
		int ar[]=new int[len];
		for(int j=0;j<len;j++)
		{
			int x=(int)(Math.random()*1000);
			ar[j]=x;
		}
	    Calendar cal;
     
     //ð��
     //Bubble a=new Bubble();
     
     //ѡ��
     //Select b=new Select();
    
     //����
     Insert c=new Insert();
     
     //����
     //Quick d=new Quick();
     
     //ʱ��
     
     cal=Calendar.getInstance();  
     System.out.println(cal.getTime());
     c.insert(ar);
     //Arrays.sort(ar);//  ����Java���Ѿ�ʵ�ֵķ������򣨿������򷨣���
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
//ð��
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
//ѡ��
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
//����
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
//����
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
		//������start�±������Ϊkey���Ҳ�ɨ��
		j--;
	}
	if(i<j)
	{
		//�Ҳ�ɨ�裬�ҳ���һ����keyС�ģ�����λ��
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	while(i<j&&a[i]<a[j])
	{
		//���ɨ�裨��ʱa[j]�д洢��keyֵ��
		i++;
	}
	if(i<j)
	{
		//�ҳ���һ����key��ģ�����λ��
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
	if(i-start>1)
	{
		//�ݹ���ã���keyǰ����������
		quickSort(a,start,i-1);
	}
	if(end-i>1)
	{
		quickSort(a,i+1,end); //�ݹ���ã���key������������
	}
	}
}
