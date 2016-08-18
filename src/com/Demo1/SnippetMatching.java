package com.Demo1;

	import java.io.BufferedReader;
	//import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	//import java.io.FileWriter;
	import java.io.IOException;
	import java.io.File;
	
	public class SnippetMatching 
	{
		public static void main(String[] args)
		{
			File f1 = new File("F://JavaResult1.txt");
			File f2 = new File("F://JavaResult2.txt");
			Func func = new Func();
			StringBuffer strbuff1 = func.transform(f1);
		    StringBuffer strbuff2 = func.transform(f2);
		    func.findLCS((strbuff1.toString()).toCharArray(), (strbuff2.toString()).toCharArray());
		}
	}
	class Func
	{
		public StringBuffer transform(File f)//处理代码片段
		{
			String type[] = {"byte","short","int","long","float","double","char","boolean"};//基本数据类型
			StringBuffer strbuff = new StringBuffer("");
			try{
				FileReader reader = new FileReader(f);
				BufferedReader br = new BufferedReader(reader);
				String str = null;
				int index;
				String keyword = "";//类名
				while((str = br.readLine()) != null)
				{
					for(int k = 0;k<str.length();k++)//去掉行首空格
	                {
	                	if(str.charAt(k)!=' ')
	                	{
	                		str = str.substring(k,str.length());
	                		break;
	                	}
	                }
					if(str.indexOf("new") != -1)//class instantiations
					{
						index = str.indexOf(" ");
						keyword = str.substring(0, index);
						strbuff.append("CI_"+keyword);
					}
					if(str.indexOf(".") != -1)//function calls
					{
						index = str.indexOf(" ");
						keyword = str.substring(0, index);
						strbuff.append("FC_"+keyword);
					}
					for(int i = 0;i < 8;i++)//assignments
					{
						if(str.indexOf(type[i]) != -1)
						{
							strbuff.append("AM_"+type[i]);
						}
					}
				}
				br.close();
	            reader.close();
			}
			catch(FileNotFoundException e) {
	            e.printStackTrace();
	      }
			catch(IOException e) {
	            e.printStackTrace();
	      }
			
		
			System.out.println(strbuff);
			return strbuff;
		}
		public void findLCS(char[] string ,char[] string2) //寻找最长子串
		{   
	        int m = string.length;  
	        int n = string2.length;
	        int[][] c = new int[m+1][n+1];  
	        int[][] b = new int[m+1][n+1];  
	        for(int i=0;i<m;i++) {  
	            for(int j=0;j<n;j++) {  
	                if(string[i]==string2[j]) {  
	                    c[i+1][j+1]=c[i][j]+1;  
	                    b[i+1][j+1]= '\\';  
	                } else {  
	                    if(c[i][j+1] >= c[i+1][j]) {  
	                        c[i+1][j+1] = c[i][j+1];  
	                        b[i+1][j+1]= '|';  
	                    } else {  
	                        c[i+1][j+1] = c[i+1][j];  
	                        b[i+1][j+1]= '-';  
	  
	                    }  
	                }  
	            }  
	        }  
	        int score = 2*c[m][n]/(m+n); //相似度 
	        System.out.println("LCS长度:"+c[m][n]);  
	        System.out.println("相似度:"+score);    
	        System.out.println("LCS序列:");  
	        printLCS(b,string,m,n);  
	    }
		private static void printLCS(int[][] b, char[] string, int i, int j) {  
	        if(i==0 || j==0) {  
	            return ;  
	        }  
	          
	        if(b[i][j]=='\\') {  
	            printLCS(b, string, i-1, j-1);  
	            System.out.print(string[i-1]);  
	        } else if(b[i][j]=='|'){  
	            printLCS(b, string, i-1, j);  
	        } else {  
	            printLCS(b, string, i, j-1);  
	        }  
	           
	    }  
	}
