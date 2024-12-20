import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations extends JFrame
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btn;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		btn = new JButton("INSERT");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String db="jdbc";
				String host = "jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String name = tf1.getText().toString();
					String surname = tf2.getText().toString();
					
					String sql = "insert into info(id,name,surname) values (null,'"+name+"','"+surname+"')";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Success");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		
		
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
		
		//setSize(500,500);
	}
	
	public void viewdata()
	{
		String db = "jdbc";
		String host= "jdbc:mysql://localhost:3306/";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			String query = "select * from info";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(query);
			
			System.out.println("ID"+" "+"NAME"+" "+"SURNAME");
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				System.out.println(id+" "+name+" "+surname);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}
}
