import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//out.print("Hello");
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		if(email.equals("a@gmail.com") && pass.equals("1234"))
		{
			//out.print("Pass");
			//resp.sendRedirect("success.html");
			//RequestDispatcher rd = req.getRequestDispatcher("First");
			//req.setAttribute("myemail",email);
			//rd.forward(req, resp);
			
		}
		else
		{
			//out.print("Fail");
			//resp.sendRedirect("fail.html");
			//RequestDispatcher rd = req.getRequestDispatcher("fail.html");
			//rd.include(req, resp);
		}
		
	
	}
}
