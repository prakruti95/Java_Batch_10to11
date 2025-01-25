import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet
{
	
	String host="";
	String port="";
	String user="";
	String pass="";
	
	@Override
	public void init() throws ServletException
	{
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("recipient");
		String subject = req.getParameter("subject");
		String content = req.getParameter("content");
	
		try
		{
			EmailUtility.sendEmail(host,port,user,pass,name,subject,content);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	
	}
}
