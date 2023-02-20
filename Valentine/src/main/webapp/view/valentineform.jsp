<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	#vform
	{
		padding:10px;
		margin:10px;'
	}
</style>
</head>
<body bgcolor="beige">
	<form:form action="valentinedetails" modelAttribute="valentine" id="vform">
		Date:   <form:input path="date"/><br><br>
		Gifts:  <form:input path="gifts"/><br><br>
		Location:<form:input path="location"/><br><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>