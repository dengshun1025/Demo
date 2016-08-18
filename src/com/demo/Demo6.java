package com.demo;

import java.util.*;

/**
 * @author shun
 */
public class Demo6 {

	public static Scanner sr;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		EmpManage em= new EmpManage();
		sr=new Scanner(System.in);
		while(true)
		{
			System.out.println("请选择操作：");
			System.out.println("1.添加员工：");
			System.out.println("2.查找员工：");
			System.out.println("3.修改工资：");
			System.out.println("4.删除员工：");
			System.out.println("5.退出！");
			int x=sr.nextInt();
			if(x==1)
			{
				System.out.println("请输入编号：");
				String nom=sr.next();
				System.out.println("请输入名字：");
				String name=sr.next();
				System.out.println("请输入工资：");
				float sal=sr.nextFloat();
				Emp emp=new Emp(nom,name,sal);
				em.addEmp(emp);
			}
			else if(x==2)
			{
				System.out.println("请输入编号：");
				String nom=sr.next();
				em.showInfo(nom);
			}
			else if(x==3)
			{
				System.out.println("请输入编号：");
				String nom=sr.next();
				System.out.println("请输入新工资：");
				float sal=sr.nextFloat();
				em.updateSal(nom, sal);
			}
			else if(x==4)
			{
				System.out.println("请输入编号：");
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

// 雇员管理
class EmpManage {
	private ArrayList<Emp> al = null;

	public EmpManage() {
		al = new ArrayList<Emp>();
	}

	// 加入员工
	public void addEmp(Emp emp) {
		al.add(emp);
	}

	// 显示员工信息
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
	//修改薪水
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
	//删除
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

// 雇员
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
