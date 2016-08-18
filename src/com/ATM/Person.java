package com.ATM;

public class Person
{
	private String name;
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name,String no,double fee)
	{
		this.name=name;
		this.account=new Account(no,fee);
	}
}
