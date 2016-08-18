package com.text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.*;

/**
 * JTable
 * @author 邓舜
 */

@SuppressWarnings("serial")
public class Text10 extends JFrame{
	Vector<Object> data=null,line=null,column;
	JTable jtb;
	JScrollPane jsp;
	Connection ct;
	PreparedStatement ps;
	ResultSet rs;
	public Text10()
	{
		column=new Vector<>() ;
		column.add("学号");
		column.add("姓名");
		column.add("年龄");
		column.add("性别");
		column.add("院系");
		data=new Vector<>();
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ct=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Mydb","sa","dengshun");
			ps=ct.prepareStatement("select * from student");
			rs=ps.executeQuery();
			while(rs.next())
			{
				line=new Vector<>();
				line.add(rs.getInt(1));
				line.add(rs.getString(2));
				line.add(rs.getInt(3));
				line.add(rs.getString(4));
				line.add(rs.getString(5));
				data.add(line);
			}
		} catch (Exception e) {
           e.printStackTrace();
		}finally{
				try {
					if(rs!=null)
					    rs.close();
					if(ps!=null)
						ps.close();
					if(ct!=null)
						ct.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		jtb=new JTable(data, column);
		jsp=new JScrollPane(jtb);
		
		this.add(jsp);
		
		setTitle("学生表");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
        @SuppressWarnings("unused")
		Text10 jf=new Text10();
	}

}
