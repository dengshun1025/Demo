package com.Demo1;
/**
 * BufferedReader BufferedWriter 缓冲字符流;
 * @author shun
 *
 */
import java.io.*;
public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
        BufferedReader br=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
			fr=new FileReader("F:\\tankgame\\log.txt");//输入流
			br=new BufferedReader(fr);
			fw=new FileWriter("F:\\tankgame\\log1.txt");//输出流
			bw=new BufferedWriter(fw);
			String s="";
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
				bw.write(s+"\r\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
