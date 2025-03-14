package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
		}
		catch(Exception e)
		{
			
		}
		
		return con;
	}
	
	public static int savedata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into info (name,email,address,phone) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
		
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Model> viewdata()
	{
		ArrayList<Model> arrayList = new ArrayList();
		
		Connection con = Dao.getconnect();
		
		String sql = "select * from info";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setEmail(email);
				m.setAddress(address);
				m.setPhone(phone);
				
				arrayList.add(m);
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return arrayList;
	}
	
	public static int deletedata(int id)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		String sql ="delete from info where id =?";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Model selectdata(int id)
	{
		Model m = null;
		
		Connection con = Dao.getconnect();
		
		String sql = "select * from info where id=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				m = new Model();
				m.setId(id1);
				m.setName(name);
				m.setEmail(email);
				m.setAddress(address);
				m.setPhone(phone);
				
				
			}
			
			
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}
	public static int updatedata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update info set name=?,email=?,address=?,phone=? where id=?");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
			ps.setInt(5,m.getId());
		
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
}
