<%@page import="com.model.WishlistModel"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"/>
	<%
	
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		List<WishlistModel>list = Dao.getwishlistbyid(id2);
		for(WishlistModel wm : list)
		{
			
		
	%>
	<br>
	<br>
	<center>
		<img src="data:image/jpeg;base64,<%=wm.getP_image()%>" width="150px" height="200px" />
		<h3><b>Name:</b> <%= wm.getP_name() %></h3>
	    <p><b>Price:</b> <%= wm.getP_price() %></p>
	    <p><b>Product Details:</b><%=wm.getP_des() %>
	    <br>
	   
	   
   
    
<form action="imageSave2" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>		

	<div class="form-group input-group">
				<input name="p_name" class="form-control" placeholder="Product Name" type="hidden" id="p_name" value="<%=wm.getP_name()%>">
			</div>
			
			<div class="form-group input-group">
				<input name="p_price" class="form-control" placeholder="Product Price" type="hidden" id="p_price"value="<%=wm.getP_price()%>">
			</div>
			
			<div class="form-group input-group">
				<input name="p_des" class="form-control" placeholder="Product Description" type="hidden" id="p_des"value="<%=wm.getP_des()%>">
			</div>
			
			<div class="form-group input-group">
				<input type="hidden" name="p_image" value="data:image/jpeg;base64,<%=wm.getP_image() %>" /> 
			</div>
			
			<div class="form-group input-group">
					<input name="email" class="form-control" placeholder="Product Description" type="hidden" id="email"value="<%=session.getAttribute("email")%>">
			</div>
			<!-- form-group// -->
			<div class="form-group">
			 <input type="submit" class="swd-button" value="Add to Wishlist">
			</div>
			<!-- form-group// -->
			
		</form>
     </center>	
	<%
		}
	%>
	<jsp:include page="footer.jsp"/>

</body>
</html>