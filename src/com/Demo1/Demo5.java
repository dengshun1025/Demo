package com.Demo1;
/**
 * FileReader FileWriter; 字符型
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
			fr=new FileReader("F:\\tankgame\\log1.txt");//输入流
			//fw=new FileWriter("F:\\tankgame\\log1.txt");//输出流
			
			char[] c=new char[1024];//字符数组
			int n=0;//得到读到的字符数
			while((n=fr.read(c))!=-1)
			{
				String s=new String(c,0,n);//把字符变为String;
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
