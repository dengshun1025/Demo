package com.Demo1;
/**
 * FileInputStream��;  �ֽ���
 */
import java.io.*;
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("F:/tankgame/log.txt");//�ļ�
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(file);//������д
			byte[] b=new byte[1024];//����һ���ֽ����飬�൱�ڻ���
			int n=0;//�õ�ʵ�ʶ������ֽ���
			while((n=fis.read(b))!=-1)
			{
				String s= new String(b,0,n);//���ֽ�ת����String;
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
