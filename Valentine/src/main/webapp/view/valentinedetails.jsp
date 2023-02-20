<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table,th,td,tr
	{
		border:1px solid black;
		padding:5px;
	}
	
	table
	{
		border-collapse:collapse;
	}
	
</style>
</head>
<body bgcolor="beige">
	<table>
		<tr>
			<th>Date</th>
			<th>Gifts</th>
			<th>Location</th>
		</tr>
		<tr>
			<td>${valentine.date}</td>
			
			<td>
			${valentine.gifts}	
			</td>
			<td>${valentine.location}</td>
		</tr>
	</table><br>
</body>
</html>