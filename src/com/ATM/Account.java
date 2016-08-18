package com.ATM;

public class Account
{
	private String no;
	private double fee;
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Account(String no,double fee)
	{
		this.no=no;
		this.fee=fee;
	}
	//转账
	public void tran(Person person1,String no,Person person2,double fee)
	{
		if(person1.getAccount().no.equals(no))
		{
		person1.getAccount().setFee(person1.getAccount().fee-fee);
		person2.getAccount().setFee(person2.getAccount().fee+fee);
		System.out.println("转账成功！");
		}
		else
			System.out.println("密码错误！");
	}
	//查询
	public void query(Person person,String no)
	{
		if(person.getAccount().no.equals(no))
		{
			System.out.println("余额："+person.getAccount().fee);
		}
		else {
			System.out.println("密码错误！");
		}
	}
	//取款
	public void draw(Person person,String no,double fee)
	{
		if(person.getAccount().no.equals(no))
		{
			person.getAccount().setFee(person.getAccount().fee-fee);
			System.out.println("取款成功！");
		}
		else {
			System.out.println("密码错误！");
		}
	}
}
