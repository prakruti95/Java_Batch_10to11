import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao 
{
	//db connectivity
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	//signup data
	public static int signup(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		String sql ="insert into register (uname,email,pass) values (?,?,?)";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getUname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPass());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	//Login 
	
	public static Model logindata(Model m)
	{
		
		Model m2 = null;
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from register where uname=? and pass=?");
			
			ps.setString(1,m.getUname());
			ps.setString(2,m.getPass());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String uname = set.getString(2);
				String email = set.getString(3);
				String pass = set.getString(4);
				
				m2 = new Model();
				m2.setId(id);
				m2.setUname(uname);
				m2.setEmail(email);
				m2.setPass(pass);
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
