package com.text;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author ��˴
 * ��ѡ���븴ѡ��
 */
public class Text8 extends JFrame{

	private static final long serialVersionUID = -4589253634538264345L;
    
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
     Text8 jf=new Text8();
     jf.setVisible(true);
	}
   public Text8()
   {
	    jp1=new JPanel();
  	    jp2=new JPanel();
  	    jp3=new JPanel();
  	    
  	    jb1=new JButton("ע��");
 	    jb2=new JButton("ȡ��");
 	     
 	    jl1=new JLabel("ϲ��������");
  	    jl2=new JLabel("�Ա�");
  	    
  	    jcb1=new JCheckBox("�����");
  	    jcb2=new JCheckBox("��ʫʫ");
  	    jcb3=new JCheckBox("��־��");
  	    
  	    jrb1=new JRadioButton("��");
  	    jrb2=new JRadioButton("Ů");
  	    
  	    bg=new ButtonGroup();
  	    
  	    this.setLayout(new GridLayout(3,1));
  	    
  	    jp1.add(jl1);
  	    jp1.add(jcb1);
        jp1.add(jcb2);
    	jp1.add(jcb3);
        
        bg.add(jrb1);
        bg.add(jrb2);
        
        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        
        jp3.add(jb1);
        jp3.add(jb2);
        
  	    this.add(jp1);
  	    this.add(jp2);
  	    this.add(jp3);

 	   this.setTitle("�û�ע��   ");
 	   this.setSize(300, 150);
 	   this.setResizable(false);
 	   this.setLocationRelativeTo(null);
 	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	   
   }
   
}
