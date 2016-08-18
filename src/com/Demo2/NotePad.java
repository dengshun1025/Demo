package com.Demo2;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
@SuppressWarnings("serial")
public class NotePad extends JFrame implements ActionListener{

	JTextArea jta;
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi1,jmi2;
	JScrollPane jsp;
	public NotePad()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jmb=new JMenuBar();
		jm=new JMenu("文件");
		jmi1=new JMenuItem("打开");
		jmi1.addActionListener(this);
		jmi2=new JMenuItem("保存");
		jmi2.addActionListener(this);
		
		jm.add(jmi1);
		jm.add(jmi2);
		
		jmb.add(jm);

		this.setJMenuBar(jmb);
		this.add(jsp);
		
		this.setTitle("记事本");
		this.setSize(400, 300);
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		NotePad np=new NotePad();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jmi1)
		{
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);//null表示以默认方式打开;
            jfc.setVisible(true);
            if(jfc.getSelectedFile()!=null)
            {
            String filename=jfc.getSelectedFile().getAbsolutePath();
            FileReader fr=null;
            BufferedReader br=null;
            
            try {
				fr=new FileReader(filename);
				br=new BufferedReader(fr);
				String s="";
				String all="";
				while((s=br.readLine())!=null)
				{
					all+=s+"\r\n";
				}
				jta.setText(all);
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}finally
			{
				try {
					br.close();
					fr.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		    }
		}
		else if(e.getSource()==jmi2)
		{
			JFileChooser jfc=new JFileChooser();
			jfc.showSaveDialog(null);//null表示以默认方式打开;
            jfc.setVisible(true);
            if(jfc.getSelectedFile()!=null)
            {
            String filename=jfc.getSelectedFile().getAbsolutePath();
            FileWriter fw=null;
            BufferedWriter bw=null;
            
            try {
				fw=new FileWriter(filename);
				bw=new BufferedWriter(fw);
			    bw.write(jta.getText());
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}finally
			{
				try {
					bw.close();
					fw.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		    }
		}
	}

}
