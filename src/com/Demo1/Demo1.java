package com.Demo1;
/**
 * 文件流操作
 */
import java.io.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File dir=new File("F:/tankgame");
         if(!dir.isDirectory())
         {
        	 dir.mkdir();
         }
         File file=new File("F:/tankgame/log.txt");
         if(!file.exists())
         {
        	 try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }else
         {
//        	 System.out.println(file.getName());
//        	 System.out.println(file.getAbsolutePath());
//        	 System.out.println(file.length());
         }
//         File dir2=new File("C:\\Windows");
//         if(dir2.isDirectory())
//         {
//        	 File list[]=dir2.listFiles();
//        	 for(int i=0;i<list.length;i++)
//        	 {
//        		 System.out.println(list[i].getName());
//        	 }
//         }
         
	}

}
