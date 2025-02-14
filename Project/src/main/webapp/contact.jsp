<%@page import="com.model.SignupModel"%>
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
			
		
			if(session.getAttribute("myproject")!=null)
			{
				SignupModel m = Dao.getemail(session.getAttribute("email").toString());
			
		%>
		
		<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
		<h4 class="card-title mt-3 text-center">Enter Your Details for Contact Will Connect With You Shortly</h4>
		<p class="text-center"></p>
		
		<form action="contactinsert.jsp" method="post">
			
			
			 <input type="hidden" name="access_key" value="3e23c58f-e10b-4193-a31e-9898c580047d">
			
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="name" class="form-control" placeholder="Enter Name"
					type="text" id="name" value="<%=m.getFullname()%>">
					
			</div>
		
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email address"
					type="email" id="email" value="<%=m.getEmail()%>">
					
			</div>
			
				<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="number" class="form-control" placeholder="Enter Number"
					type="number" id="number" value="<%=m.getPhone()%>">
					
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="query" class="form-control" placeholder="Enter Query"
					type="text" id="query">
					
			</div>
		
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Submit Query</button>
			</div>
			
		</form>
		<span id="tops"></span>
		</article>
	</div>
	<!-- card.// -->
		
	<%
			}
			else
			{

				

				
			
	%>
	
		<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
		<h4 class="card-title mt-3 text-center">Enter Your Details for Contact Will Connect With You Shortly</h4>
		<p class="text-center"></p>
		
		<form action="https://api.web3forms.com/submit" method="post">
			
			
			 <input type="hidden" name="access_key" value="3e23c58f-e10b-4193-a31e-9898c580047d">
			
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="name" class="form-control" placeholder="Enter Name"
					type="text" id="name" >
					
			</div>
		
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email address"
					type="email" id="email" >
					
			</div>
			
				<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="number" class="form-control" placeholder="Enter Number"
					type="number" id="number" >
					
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="query" class="form-control" placeholder="Enter Query"
					type="text" id="query">
					
			</div>
		
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Submit Query</button>
			</div>
			
		</form>
		<span id="tops"></span>
		</article>
	</div>
	
	
	<%
			}
	%>
	
	<jsp:include page="footer.jsp"/>

</body>
</html>