<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="second.jsp">
		
		<p>
			Enter Name:<input type="text" name="name">
		</p>

		<p>
			Enter Pass:<input type="password" name="pass">
		</p>	
		
		<p>
			<input type="submit" value="submit">
		</p>
		
	</form>
	
	
	<%= Calendar.getInstance().getTime() %>
	
	
	<%!
		int cube(int n)
		{
			return n*n*n;
		}
	%>
	
	<br>
	<br>
	
	<%=cube(3) %>
	
	
	

</body>
</html>