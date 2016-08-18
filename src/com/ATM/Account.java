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
	//ת��
	public void tran(Person person1,String no,Person person2,double fee)
	{
		if(person1.getAccount().no.equals(no))
		{
		person1.getAccount().setFee(person1.getAccount().fee-fee);
		person2.getAccount().setFee(person2.getAccount().fee+fee);
		System.out.println("ת�˳ɹ���");
		}
		else
			System.out.println("�������");
	}
	//��ѯ
	public void query(Person person,String no)
	{
		if(person.getAccount().no.equals(no))
		{
			System.out.println("��"+person.getAccount().fee);
		}
		else {
			System.out.println("�������");
		}
	}
	//ȡ��
	public void draw(Person person,String no,double fee)
	{
		if(person.getAccount().no.equals(no))
		{
			person.getAccount().setFee(person.getAccount().fee-fee);
			System.out.println("ȡ��ɹ���");
		}
		else {
			System.out.println("�������");
		}
	}
}
