import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations extends JFrame
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton btn,btndelete,btnedit,btnupdate;
	JPanel jp,jp2;
	int did=0;
	
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
	
	public void deletedata()
	{
		
		deleteframe = new JFrame();
		tf3 = new JTextField(20);
		btndelete = new JButton("Delete");
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				String db = "jdbc";
				String host= "jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				String id = tf3.getText().toString();
				int id2 = Integer.parseInt(id);
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String query = "delete from info where id='"+id2+"'";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(query);
					
					if(status>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				}
				catch (Exception e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
				
			}
		});
		deleteframe.add(tf3);
		deleteframe.add(btndelete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
	
	
	}
	
	public void updatedata()
	{
		updateframe = new JFrame();
	
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
	
		btnedit = new JButton("Edit");
		btnupdate = new JButton("Update");
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		jp.add(tf3);
		jp.add(btnedit);
		
		
		String db = "jdbc";
		String host= "jdbc:mysql://localhost:3306/";
		String url = host+db;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");

			
			btnedit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					
					jp.setVisible(false);
					jp2.setVisible(true);

					
					try
					{
						String a = tf3.getText().toString();
						did = Integer.parseInt(a);
						
						String query = "select * from info where id='"+did+"'";
						Statement stmt = con.createStatement();
						
						ResultSet set = stmt.executeQuery(query);
						
						if(set.next())
						{
							
							int id3 = set.getInt(1);
							String name = set.getString(2);
							String surname = set.getString(3);
							
							
							
							tf1.setText(name);
							tf2.setText(surname);
							
							btnupdate.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
								
									try 
									{
										Class.forName("com.mysql.jdbc.Driver");
										Connection con = DriverManager.getConnection(url,"root","");
									
										String name = tf1.getText().toString();
										String surname = tf2.getText().toString();
										
										String query = "update info set name='"+name+"',surname='"+surname+"' where id='"+did+"'";
										
										Statement stmt = con.createStatement();
										
										int a = stmt.executeUpdate(query);
										
										if(a>0)
										{
											System.out.println("Updated");
											updateframe.setVisible(false);
										}
										else
										{
											System.out.println("Error");
										}
									}
									catch (Exception e1) 
									{
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
										
									
									
								}
							});
						}
						
					}
					catch(Exception e2)
					{
						System.out.println(e2);
					}
					
				
				}
			});
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btnupdate);
		
		jp2.setVisible(false);
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
	}
}
