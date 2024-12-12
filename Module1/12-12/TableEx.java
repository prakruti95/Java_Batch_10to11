package tops1212;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx 
{
	 JFrame f;    
	 
	public TableEx() 
	{
		
		 f=new JFrame();    
		 
		 String data[][]={ {"101","Amit","670000"},    
		                          {"102","Jai","780000"},    
		                          {"101","Sachin","700000"}};    
		 String column[]={"ID","NAME","SALARY"};         
		 JTable jt=new JTable(data,column);    
		 jt.setBounds(30,40,200,300);          
		 JScrollPane sp=new JScrollPane(jt);    
		 f.add(sp);          
		 f.setSize(300,400);    
		 f.setVisible(true);    
		
	}
	public static void main(String[] args) 
	{
		new TableEx();
	}
}
