<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>
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
		SignupModel m2 = Dao.login(m);
		
		if(m2!=null)
		{
			session.setAttribute("myproject",true);
			session.setAttribute("email",m2.getEmail());
			session.setAttribute("name",m2.getFullname());
			session.setAttribute("phone",m2.getPhone());
			
			response.sendRedirect("dashboard.jsp");	
		}
		else
		{
	%>
	
		<center>
			<h1 style="color: red;">Login Fail</h1>
		</center>
		
		<%@include file="signin.jsp" %>
	
	
		<%
			}
		%>
</body>
</html>