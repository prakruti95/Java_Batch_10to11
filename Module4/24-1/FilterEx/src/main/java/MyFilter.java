import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/send")
public class MyFilter implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)throws IOException, ServletException 
	{
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		
		String name = arg0.getParameter("name");
		String pass = arg0.getParameter("pass");
		
		if(name.equals("") && pass.equals(""))
		{
			out.print("All Fields are Mandatory");
		}
		else if(name.equals(null) && pass.equals(null))
		{
			out.print("Fields are Getting Null value");
		}
		else
		{
			if(pass.equals("1234"))
			{
				arg2.doFilter(arg0, arg1);
			}
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
