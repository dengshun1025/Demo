package com.Demo1;
/**
 * FileInputStream类;  字节型
 */
import java.io.*;
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("F:/tankgame/log.txt");//文件
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(file);//用来读写
			byte[] b=new byte[1024];//定义一个字节数组，相当于缓存
			int n=0;//得到实际读到的字节数
			while((n=fis.read(b))!=-1)
			{
				String s= new String(b,0,n);//把字节转换成String;
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
