package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.AdminModel;
import com.model.CartModel;
import com.model.ProductModel;
import com.model.SignupModel;
import com.model.WishlistModel;

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
				String phone = set.getString(4);
				String pass = set.getString(5);
				
				m2 = new SignupModel();
				m2.setFullname(uname);
				m2.setEmail(email);
				m2.setPhone(phone);
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
	
	public static SignupModel getemail(String email)
	{
		SignupModel m = null;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup where email=?");
			ps.setString(1,email);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String fullname = set.getString(2);
				String email1 = set.getString(3);
				String phone = set.getString(4);
				String pass = set.getString(5);
				
				m = new SignupModel();
				m.setId(id);
				m.setFullname(fullname);
				m.setEmail(email1);
				m.setPhone(phone);
				m.setPassword(pass);
				
				
			}
		} 
		catch (SQLException e) 
		{
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	//Product View 
	public static List<ProductModel> getproducts()
	{
		Connection con = Dao.getconnect();
		List<ProductModel>list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes(5);
				String encode = Base64.getEncoder().encodeToString(imgData);
				
				ProductModel pm = new ProductModel();
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);
				
				list.add(pm);
				
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//Admin Login
	
	public static AdminModel adminlogin(AdminModel m)
	{
		
		AdminModel m2 = null;
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from adminlogin where username=? and password=?");
			
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String uname = set.getString(2);
				String pass = set.getString(3);
				
				m2 = new AdminModel();
				m2.setUsername(uname);
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
	
	public static List<WishlistModel> getwishlistbyid(int id)
	{
		Connection con = Dao.getconnect();
		List<WishlistModel>list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products where id = ?");
			ps.setInt(1,id);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes(5);
				String encode = Base64.getEncoder().encodeToString(imgData);
				
				WishlistModel pm = new WishlistModel();
				pm.setId(id1);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);
				//pm.setEmail(email);
				
				list.add(pm);
				
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static List<CartModel> getcartbyid(int id)
	{
		Connection con = Dao.getconnect();
		List<CartModel>list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where id = ?");
			ps.setInt(1,id);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes(5);
				String encode = Base64.getEncoder().encodeToString(imgData);
				
				CartModel pm = new CartModel();
				pm.setId(id1);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);
				//pm.setEmail(email);
				
				list.add(pm);
				
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static List<WishlistModel> getwishlistbyemail(String email)
	{
		Connection con = Dao.getconnect();
		List<WishlistModel>list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where email=?");
			ps.setString(1, email);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes("p_image"); // blob field 
		        String encode = Base64.getEncoder().encodeToString(imgData);
				//byte[] imgData = set.getBytes(5);
				//String encode = Base64.getEncoder().encodeToString(imgData);
				
				WishlistModel pm = new WishlistModel();
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);
				pm.setEmail(email);
				
				list.add(pm);
				
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static List<CartModel> getcartbyemail(String email)
	{
		Connection con = Dao.getconnect();
		List<CartModel>list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from cart where email=?");
			ps.setString(1, email);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes("p_image"); // blob field 
		        String encode = Base64.getEncoder().encodeToString(imgData);
				//byte[] imgData = set.getBytes(5);
				//String encode = Base64.getEncoder().encodeToString(imgData);
				
				CartModel pm = new CartModel();
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);
				pm.setEmail(email);
				
				list.add(pm);
				
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static int deletefromwishlist(int id)
	{
		
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from wishlist where id =?");
			ps.setInt(1,id);
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static int deletefromcart(int id)
	{
		
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from cart where id =?");
			ps.setInt(1,id);
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	
	
}
