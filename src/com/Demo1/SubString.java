package com.Demo1;

public class SubString {

	public static void findLCS(String str1 ,String str2) //Ѱ����Ӵ�
	{   
        int m = str1.length();  
        int n = str2.length();
        int[][] c = new int[m+1][n+1];  
        int[][] b = new int[m+1][n+1];  
        for(int i=0;i<m;i++) {  
            for(int j=0;j<n;j++) {  
                if(str1==str2) {  
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
        printLCS(b,str1,m,n);  
    }
	
	private static void printLCS(int[][] b, String str1, int i, int j) {  
        if(i==0 || j==0) {  
            return ;  
        }  
          
        if(b[i][j]=='\\') {  
            printLCS(b, str1, i-1, j-1);  
            System.out.print(str1);  
        } else if(b[i][j]=='|'){  
            printLCS(b, str1, i-1, j);  
        } else {  
            printLCS(b, str1, i, j-1);  
        }  
           
    }  

		public static void main(String[] args)
		{
			String str1="<body><code>qwertyuiop</code></body>";
			String str2="<body><code></code></body>";
			int start=str1.indexOf("<code>");
			int end=str1.indexOf("</code>");
			findLCS(str1,str2);
			System.out.println(str1.substring(start+6, end));
		}
}
