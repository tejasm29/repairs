<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align="center">
	<h1>
		Car Wash Application
	</h1>
	<div >
	<form:form method="post"  action="/userSuccessLogin"	modelAttribute="user">
	${error} 
   <table>	
	   <tr>
		   <td ><label>User Id</label></td>
		   <td ><form:input path="userId" name="userId" /></td>   
	   </tr>
	   <tr>
		   <td ><label>Password</label></td>
		   <td ><form:password path="password"  name="password" />
		   				<form:errors path="password" /></td>	   
	   </tr>
	   <tr>
		   <td colspan = "2"><input type="Submit"  name="SignIn" value="Sign In" /></td>   
	   </tr>

   </table>
</form:form>
</div>

<br>
<div align="center">
	<a href="/userRegister">Not a user ? Sign Up ! </a>
<br><br>
</div>

</div>

</body>
</html>