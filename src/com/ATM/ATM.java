package com.ATM;
/**
 *  邓舜
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	
	public static Scanner scanner;
	private Person person1;
	private Person person2;
	private ArrayList<Person> al;
	public ATM() {
		scanner=new Scanner(System.in);
		al=new ArrayList<>();
		person1=new Person("dengshun", "001", 10000);
		al.add(person1);
		person2=new Person("xpjian", "002", 10000);
		al.add(person2);
	}
	public void run()
	{
		while(true)
		{
			System.out.println("1.查询。");
			System.out.println("2.取款。");
			System.out.println("3.转账。");
			System.out.println("4.退出。");
			int i=scanner.nextInt();
			switch(i)
			{
			case 1:  
			{
				System.out.println("输入姓名：");
				String name=scanner.next();
				System.out.println("输入密码：");
				String no=scanner.next();
				if(person1.getName().equals(name))
				{
					person1.getAccount().query(person1, no);
				}
				else if(person2.getName().equals(name))
				{
					person1.getAccount().query(person2, no);
				}
				else {
					System.out.println("用户不存在！");
				}
			}
			break;
			case 2:
			{
				System.out.println("输入姓名：");
				String name=scanner.next();
				System.out.println("输入密码：");
				String no=scanner.next();
				System.out.println("取款金额：");
				double fee=scanner.nextDouble();
				if(person1.getName().equals(name))
				{
					person1.getAccount().draw(person1, no,fee);
				}
				else if(person2.getName().equals(name))
				{
					person1.getAccount().draw(person2, no,fee);
				}
				else {
					System.out.println("用户不存在！");
				}
				break;
			}
			case 3:
			{
				System.out.println("输入转出人姓名：");
				String name1=scanner.next();
				System.out.println("输入密码：");
				String no=scanner.next();
				System.out.println("输入转入人姓名：");
				String name2=scanner.next();
				System.out.println("转出金额：");
				double fee=scanner.nextDouble();
				if(person1.getName().equals(name1))
				{
					if(person2.getName().equals(name2))
					person1.getAccount().tran(person1, no,person2,fee);
				}
				else if(person2.getName().equals(name1))
				{
					if(person1.getName().equals(name1))
					person1.getAccount().tran(person2, no,person2,fee);
				}
				else {
					System.out.println("转账错误");
				}
				break;
			}
			case 4: System.exit(0);  
			}
		}
	}
	public static void main(String[] args) 
	{		
		ATM atm=new ATM();
		atm.run();
	}
}
