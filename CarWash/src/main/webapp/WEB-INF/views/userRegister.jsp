<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Wash Apllication</title>
</head>
<body>
<div>
	
		<form:form method="post" action="/userRegister" modelAttribute="user">
			${status} 
			<table class = "table">
				<tr>
					<td>First Name</td>
					<td><form:input name="firstName" path="firstName" /></td>
				</tr>

				<tr>
					<td>Last Name</td>
					<td><form:input name="lastName" path="lastName" /></td>
				</tr>

				<tr>
					<td>DoB</td>
					<td><form:input path="dateOfBirth" name="dateOfBirth" /></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td>Male: <form:radiobutton path="sex" name="sex" value="M" />
					Female: <form:radiobutton path="sex" name="sex" value="F" /></td>
				</tr>

				<tr>
					<td>Contact Number</td>
					<td><form:input name="contactNumber" path="contactNumber" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><select name="category" path="category" ><option value = "C"/>Customer</option><option value="T">Cleaner</option></select></td>
				</tr>
				
				<tr>
					<td>Address</td>
					<td><form:input name="address" path="address"/></td>
				
				</tr>

				<tr>
					<td>User Id</td>
					<td><form:input name="userId" path="userId" /></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><form:password name="password" path="password" /></td>
				</tr>
				<tr>
					<td colspan = "2"><input type="submit" value="register" class="btn btn-lg btn-primary btn-block" /></td>
				</tr>
			</table>
		</form:form>
	
</div>
	
<h1>	<a href="userLogin">Login</a></h1>
	
	
</body>
</html>