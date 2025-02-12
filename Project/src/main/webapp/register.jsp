<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//get details
	    String fname=request.getParameter("fullname");  
	    String email=request.getParameter("email");  
	    String phone=request.getParameter("phone");  
		String pass=request.getParameter("password");
		String repass = request.getParameter("repassword");
		
		//set detail
		session.setAttribute("fname", fname);
		session.setAttribute("email", email);
		session.setAttribute("phone", phone);
		session.setAttribute("pass", pass);
		
		if(email==null||email.trim().equals(""))
	    {  
	    	out.print("<p>Please enter Email!</p>");  
	    }
		if(phone==null||phone.trim().equals(""))
		{
			out.print("<p>Please enter Phone!</p>");  
		}
		
		if(pass==null||pass.trim().equals(""))
		{
			out.print("<p>Please enter Password!</p>");  
		}
		if(repass==null||fname.trim().equals(""))
		{
			out.print("<p>Please enter Repassword!</p>");  
		} 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
    		ps.setString(1, email);
    		ResultSet rs=ps.executeQuery();  
    		
    		if(rs.next())
    		{
    			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");   	
    		}
    		else
    		{
    			
    			
    			int number11 = 1 + (int)(9* Math.random());
    			int number22 = 1 + (int)(9* Math.random());
    			int number33 = 1 + (int)(9* Math.random());
    			int number44 = 1 + (int)(9* Math.random());
    			
    			session.setAttribute("fname",fname);
    			session.setAttribute("email",email);
    			session.setAttribute("phone",phone);
    			session.setAttribute("pass",pass);
    			
    			
    			session.setAttribute("n1",number11);
    			session.setAttribute("n2",number22);
    			session.setAttribute("n3",number33);
    			session.setAttribute("n4",number44);
    			
    			RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet2");
    			request.setAttribute("e1", email);
    			session.setAttribute("n1",number11);
    			session.setAttribute("n2",number22);
    			session.setAttribute("n3",number33);
    			session.setAttribute("n4",number44);
    		    rd.forward(request, response);
   			}
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	%>


	<%-- <%
	
			
		int data = Dao.signup(m);
		
		if(data>0)
		{
			response.sendRedirect("signin.jsp");	
		}
		else
		{
	%>
	
		<center>
			<h1 style="color: red;">Signup Fail</h1>
		</center>
	
		<%@include file="signup.jsp" %>
	
	
		<%
			}
		%> --%>
	



</body>
</html>