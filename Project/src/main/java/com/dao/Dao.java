package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.SignupModel;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			return con;
	}
	
	public static int signup(SignupModel m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup (fullname,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
		
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static SignupModel login(SignupModel m)
	{
		
		SignupModel m2 = null;
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String uname = set.getString(2);
				String email = set.getString(3);
				String pass = set.getString(4);
				
				m2 = new SignupModel();
				m2.setEmail(email);
				m2.setPassword(pass);
			}
			else
			{
				System.out.println("Details does not match");
			}
			
			
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return m2;
		
	}
	
}
