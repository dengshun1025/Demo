package com.demo;
//����������
public class Demo2 
{
	public static void main(String[] args)
	{
		CycLink Cyc=new CycLink();
		Cyc.setlen(5);
		Cyc.create();
		Cyc.setk(1);
		Cyc.setm(4);
		Cyc.show();
		Cyc.play();
	}
	
}
//С����
class Child
{
	int nom;
	Child nextChild=null;
	public Child(int nom)
	{
		this.nom=nom;
	}
}
//��������
class CycLink
{
  Child fChild=null;
  Child temp=null;
  int len;
  int k;
  int m;
  
  public void setk(int k)
  {
	  this.k=k;
  }
  
  public void setm(int m)
  {
	  this.m=m;
  }
  
  public void setlen(int len)
  {
	  this.len=len;
  }
  
  public void play()
  {
	  Child temp1=this.fChild;
	  Child temp2=null;
	  //�ҵ���һ��С��
	  for(int i=1;i<k;i++)
	  {
		  temp2=temp1;
		  temp1=temp1.nextChild;
	  }
	  while(len!=1)
	  {
	  //��m��
	  for(int i=1;i<m;i++)
	  {
		  temp2=temp1;
		  temp1=temp1.nextChild;
	  }
	  System.out.print("  "+temp1.nom);
	  //����m�ĳ�Ȧ
	  temp2.nextChild=temp1.nextChild;
	  temp1=temp2.nextChild;
	  len--;
	  }
	  System.out.println(" ���һ���� "+temp1.nom);
  }
  public void create()
  {
	  for(int i=1;i<=len;i++)
	  {
		  if(i==1)
		  {
			  Child kid=new Child(i);
			  this.fChild=kid;
			  this.temp=kid;
		  }
		  else if(i==len)
		  {
			  Child kid=new Child(i);
			  temp.nextChild=kid;
			  temp=kid;
			  temp.nextChild=fChild;
		  }
		  else
		  {
			  Child kid=new Child(i);
			  temp.nextChild=kid;
			  temp=kid;
		  }
	  }
  }
  public void show()
  {
	  Child temp=this.fChild;
	  do
	  {
	  System.out.println("  "+temp.nom+"  ");
	  temp=temp.nextChild;
	  
	  }while(temp!=this.fChild);
  }
}