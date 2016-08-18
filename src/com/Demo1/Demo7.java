package com.Demo1;

import java.io.*;

public class Demo7 
{
	public static void main(String arg0[])
	{
		Demo7 bs=new Demo7();
	    bs.getHighScore(80);
	}
	
	public long getHighScore(long ScoreNow)
	{
		long result=0;
		FileReader fr=null;
        BufferedReader br=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
        	File f=new File("E:\\BestScore.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}else 
			{
				System.out.println("最高分"+result);
			}
			fr=new FileReader(f);//输入流
			br=new BufferedReader(fr);
			String s="";
			while((s=br.readLine())!=null)
			{
				result=new Integer(s.trim()).intValue();
				System.out.println("最高分"+result);
			}
			br.close();
			if(ScoreNow > result)
			{
				fw=new FileWriter("E:\\BestScore.txt");//输出流
				bw=new BufferedWriter(fw);
			    result=ScoreNow;
				bw.write(result+" ");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fr.close();
				if(bw!=null)
				bw.close();
				if(fw!=null)
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	    return result; 
	}
}
             