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
		public StringBuffer transform(File f)//�������Ƭ��
		{
			String type[] = {"byte","short","int","long","float","double","char","boolean"};//������������
			StringBuffer strbuff = new StringBuffer("");
			try{
				FileReader reader = new FileReader(f);
				BufferedReader br = new BufferedReader(reader);
				String str = null;
				int index;
				String keyword = "";//����
				while((str = br.readLine()) != null)
				{
					for(int k = 0;k<str.length();k++)//ȥ�����׿ո�
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
		public void findLCS(char[] string ,char[] string2) //Ѱ����Ӵ�
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
	        int score = 2*c[m][n]/(m+n); //���ƶ� 
	        System.out.println("LCS����:"+c[m][n]);  
	        System.out.println("���ƶ�:"+score);    
	        System.out.println("LCS����:");  
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
