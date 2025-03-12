<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="insert" name="insert" method="post">
		
		<p>
		Enter Name: <input type="text" name="name">
		</p>
		
		<p>
		Enter Addresss:<input type="text" name="address">
		</p>
		
		<input type="submit" value="Insert">
	</form>
	
	<a href="show">Show Data</a>
	

</body>
</html>