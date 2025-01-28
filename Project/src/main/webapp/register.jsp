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
		%>
	



</body>
</html>