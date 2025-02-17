<%@page import="com.dao.Dao"%>
<%@page import="com.model.PaymentModel2"%>
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
		HttpSession sess = request.getSession();
		
		PaymentModel2 m = new PaymentModel2();
		m.setFullname(sess.getAttribute("name").toString());
		m.setEmail(sess.getAttribute("email").toString());
		m.setPhone(sess.getAttribute("phone").toString());
		m.setP_name(sess.getAttribute("p_name").toString());
		m.setP_id(sess.getAttribute("p_id").toString());
		m.setPayment_id("11111");
		
		int status = Dao.paymentinsert(m);
		
		if(status>0)
		{
			out.print("Added");
		}
		else
		{
			out.print("Fail");
		}

%>

</body>
</html>