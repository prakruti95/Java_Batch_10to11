<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		String otp = request.getParameter("otp");
		String otp2 = request.getParameter("otp2");
		String otp3 = request.getParameter("otp3");
		String otp4 = request.getParameter("otp4");
		
		int otp11 = Integer.parseInt(otp);
		int otp22 = Integer.parseInt(otp2);
		int otp33 = Integer.parseInt(otp3);
		int otp44 = Integer.parseInt(otp4);
		
		int n1 = (int) session.getAttribute("n1");
		int n2 = (int) session.getAttribute("n2");
		int n3 = (int) session.getAttribute("n3");
		int n4 = (int) session.getAttribute("n4");
		
		if(otp11==n1)
		{
			if(otp22==n2)
			{
				if(otp33==n3)
				{
					if(otp44==n4)
					{
						
						String fname = (String) session.getAttribute("fname");
						String email = (String)session.getAttribute("email");
						String phone = (String)session.getAttribute("phone");
						String pass = (String)session.getAttribute("pass");
						
						
						SignupModel m = new SignupModel();
						m.setFullname(fname);
						m.setEmail(email);
						m.setPhone(phone);
						m.setPassword(pass);
						
						
						
						int signupstatus = Dao.signup(m);
						
						if(signupstatus>0)
						{
							response.sendRedirect("signin.jsp");
						}
						else
						{
							
					%>
					
					<center>
								
								<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Signup Failed!! Please Try Again</p></b>
					</center>
						
					<% 	
						
					}
				}
					else
					{
						out.print("OTP is wrong");		
					}
			}
				else
				{
					out.print("OTP is wrong");		
				}
		}
			else
			{
				out.print("OTP is wrong");		
			}
	}
	else
	{
		out.print("OTP is wrong");		
	}
	%>	
		
</body>
</html>