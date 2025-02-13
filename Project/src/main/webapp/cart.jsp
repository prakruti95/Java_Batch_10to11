<%@page import="com.model.CartModel"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

	  .product-grid 
	   {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            grid-gap: 20px;
            padding: 20px;
        }
        .product
        {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        .product img 
        {
            max-width: 100px;
            max-height: 100px;
        }
        .swd-button 
			{
				background: #f2db18;
				border: 1px solid white;
				border-radius: 5px;
				color: white;
				display: inline-block;
				font: bold 12px Arial, Helvetica, sans-serif;
				padding: 10px 15px;
				text-decoration: none;
				text-transform: uppercase;
				margin-top: 15px;
			}
	

</style>

</head>
<body>

	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>

<%
	String email = session.getAttribute("email").toString();
	if(session.getAttribute("myproject")!=null)
	{
		

%>
<jsp:include page="header.jsp"/>

	<div class="product-grid">
		<%
			List<CartModel>list = Dao.getcartbyemail(email);
			
			for(CartModel m : list)
			{
		%>
		
			 <div class="product">
			 	 <img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
			 	<h3><b>Name:</b> <%= m.getP_name() %></h3>
            	<p><b>Price:</b> <%= m.getP_price() %></p>
            	<p><b>Product Details:</b><%=m.getP_des() %>
          
            
            <form action="removefromcart.jsp">
            	<input type="hidden" name="id" value="<%=m.getId()%>">
            	<input type="submit" class="swd-button" value="Remove From Cart">
            </form>
            
               <form action="payment.jsp">
            	<input type="hidden" name="id" value="<%=m.getId()%>">
            	<input type="submit" class="swd-button" value="Proceed to Payment">
            </form>
			 </div>
			 
			
		
		<% 		
			}
		%>
	</div>

<jsp:include page="footer.jsp"/>

<%
	}
	else
	{
			response.sendRedirect("signin.jsp");
	}
%>
</body>
</html>