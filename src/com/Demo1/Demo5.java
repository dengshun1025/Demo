package com.Demo1;
/**
 * FileReader FileWriter; �ַ���
 * @author shun
 */
import java.io.*;
public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr=null;
		//FileWriter fw=null;
		
		try {
			fr=new FileReader("F:\\tankgame\\log1.txt");//������
			//fw=new FileWriter("F:\\tankgame\\log1.txt");//�����
			
			char[] c=new char[1024];//�ַ�����
			int n=0;//�õ��������ַ���
			while((n=fr.read(c))!=-1)
			{
				String s=new String(c,0,n);//���ַ���ΪString;
				System.out.println(s);
				//fw.write(c, 0, n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fr.close();
				//fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
