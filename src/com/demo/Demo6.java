package com.demo;

import java.util.*;

/**
 * @author shun
 */
public class Demo6 {

	public static Scanner sr;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		EmpManage em= new EmpManage();
		sr=new Scanner(System.in);
		while(true)
		{
			System.out.println("��ѡ�������");
			System.out.println("1.���Ա����");
			System.out.println("2.����Ա����");
			System.out.println("3.�޸Ĺ��ʣ�");
			System.out.println("4.ɾ��Ա����");
			System.out.println("5.�˳���");
			int x=sr.nextInt();
			if(x==1)
			{
				System.out.println("�������ţ�");
				String nom=sr.next();
				System.out.println("���������֣�");
				String name=sr.next();
				System.out.println("�����빤�ʣ�");
				float sal=sr.nextFloat();
				Emp emp=new Emp(nom,name,sal);
				em.addEmp(emp);
			}
			else if(x==2)
			{
				System.out.println("�������ţ�");
				String nom=sr.next();
				em.showInfo(nom);
			}
			else if(x==3)
			{
				System.out.println("�������ţ�");
				String nom=sr.next();
				System.out.println("�������¹��ʣ�");
				float sal=sr.nextFloat();
				em.updateSal(nom, sal);
			}
			else if(x==4)
			{
				System.out.println("�������ţ�");
				String nom=sr.next();
				em.delemp(nom);
			}
			else if(x==5)
			{
				System.exit(0);
			}
		}
	}

}

// ��Ա����
class EmpManage {
	private ArrayList<Emp> al = null;

	public EmpManage() {
		al = new ArrayList<Emp>();
	}

	// ����Ա��
	public void addEmp(Emp emp) {
		al.add(emp);
	}

	// ��ʾԱ����Ϣ
	public void showInfo(String nom) {
		for (int i = 0; i < al.size(); i++) {
			Emp emp = (Emp) al.get(i);
			if (emp.getNom().equals(nom))
			{
				System.out.println("nom=" + nom);
				System.out.println("name=" + emp.getName());
				System.out.println("sal=" + emp.getSal());
			}
		}
	}
	//�޸�нˮ
	public void updateSal(String nom,float sal)
	{
		for(int i=0;i<al.size();i++)
		{
			Emp emp=al.get(i);
			if(emp.getNom().equals(nom))
			{
				emp.setSal(sal);
			}
		}
	}
	//ɾ��
	public void delemp(String nom)
	{
		for(int i=0;i<al.size();i++)
		{
			Emp emp=al.get(i);
			if(emp.getNom().equals(nom))
			{
				al.remove(i);
			}
		}
	}
}

// ��Ա
class Emp {
	private String nom;
	private String name;
	private float sal;

	public Emp(String nom, String name, float sal) {
		this.name = name;
		this.nom = nom;
		this.sal = sal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
}
