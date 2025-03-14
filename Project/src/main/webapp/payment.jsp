<%@page import="com.model.PaymentModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="https://checkout.razorpay.com/v1/checkout.js"></script>
</head>
<body>


	<%
	String id = request.getParameter("id");
			int id2 = Integer.parseInt(id);
			List<PaymentModel>list = Dao.getpaymentbyid(id2);
			for(PaymentModel pm : list)
			{
				
				session.setAttribute("p_name",pm.getP_name());
				session.setAttribute("p_id",pm.getId());
				
	%>

  <form id="paymentForm">
  		<h1><%=pm.getP_name() %></h1>
  		<h2><%=pm.getP_price() %></h2>
        <input type="hidden" name="amount" id="amount" value="100"> <!-- Amount in paise -->
        <input type="hidden" name="currency" id="currency" value="INR">
        <button type="button" id="rzp-button1">Pay Now</button>
    </form>
    
    <%
			}
    %>

  <script>
        var options = {
            "key": "rzp_test_hWS7k6CBHBiHw3", // Enter the API Key ID generated from the Dashboard
            "amount": document.getElementById("amount").value, // Amount is in currency subunits. Hence, 50000 means 50000 paise
            "currency": document.getElementById("currency").value,
            "name": "Test",
            "description": "Test Transaction",
            "handler": function (response) {
                alert("Payment successful. Payment ID: " + response.razorpay_payment_id);
                window.location.href = 'xyz.jsp';
                // You can redirect to a success page or handle success here
            },
            "theme": {
                "color": "#F37254"
            }
        };

        document.getElementById('rzp-button1').onclick = function (e) {
            var rzp1 = new Razorpay(options);
            rzp1.open();
            e.preventDefault();
        }
    </script>

</body>
</html>