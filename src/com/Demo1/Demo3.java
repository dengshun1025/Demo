package com.Demo1;
/**
 * FileOutputStream
 * @author shun
 */
import java.io.*;
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:/tankgame/log.txt");//нд╪Ч
		FileOutputStream fos = null;
		try {
			fos=new FileOutputStream(file);
			String s="hello!\r\n";
			String s1="hello,world!";
			fos.write(s.getBytes());
			fos.write(s1.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
