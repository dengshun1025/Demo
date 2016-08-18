package com.Demo1;
/**
 * Í¼Æ¬¿½±´
 * @author shun
 */
import java.io.*;
public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FileInputStream fis=null;
      FileOutputStream fos=null;
      
      try {
		fis=new FileInputStream("F:\\LOL.jpg");
		fos=new FileOutputStream("E:\\a.jpg");
		byte[] b=new byte[1024];
		@SuppressWarnings("unused")
		int n=0;
		while((n=fis.read(b))!=-1)
		{
			fos.write(b);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
	{
		try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
