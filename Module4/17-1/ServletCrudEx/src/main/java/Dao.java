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
	
	//insert data
	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		String sql ="insert into details (name,surname,email) values (?,?,?)";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	//view data
	public static List<Model> viewdata()
	{
		ArrayList<Model> arrayList = new ArrayList();
		
		Connection con = Dao.getconnect();
		
		String sql = "select * from details";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String email = set.getString(4);
				
				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setSurname(surname);
				m.setEmail(email);
				
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
	
	//delete data
	public static int deletedata(int id)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		String sql ="delete from details where id =?";
		
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
	
	//fetch detail using id
	
	public static Model editdata(int id)
	{
		
		Connection con = Dao.getconnect();
		Model m = null;
		
		String sql = "select * from details where id=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String email = set.getString(4);
				
				m = new Model();
				m.setId(id);
				m.setName(name);
				m.setSurname(surname);
				m.setEmail(email);
				
				
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
		String sql ="update details set name=?,surname=?,email=? where id=?";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			ps.setInt(4,m.getId());
			
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
