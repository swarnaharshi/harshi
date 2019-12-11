<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

table, td, th {  TD{font-family: Arial; font-size: 14pt;}

  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 60%;
}

th, td {
  padding: 10px;
}
</style>
</head>
<body>

<hr size="4" color="red"></hr>
<h1>Project Manager Dashboard</h1>
<table>
	<tr>
		<td colspan="4" align="left">
			<form action="requestform">
				<input type="submit" value="New Request" 
				style="background-color: red;color:white;font-size:large;"/>
			</form>
		</td>
	</tr>
</table>
<br>
<table>
	<tr style="background-color: lime;">
		<td>Request ID</td>
		<td>PM</td>
		<td>Vertical</td>
		<td>Technology</td>
		<td>Date requested</td>
		<td>Approx Participants</td>
		<td>Location</td>
		<td>Type</td>
		<td>Delete Request</td>
		<td>Edit Request</td>
	</tr>
	<c:forEach var="tro" items="${all}">
		<tr>
			<td>${tro.request_id}</td>
			<td>${tro.request_pm_name}</td>
			<td>${tro.request_pm_vertical}</td>
			<td>${tro.request_technology}</td>
			<td>${tro.request_date}</td>
			<td>${tro.approx_participants}</td>
			<td>${tro.training_location}</td>
			<td>${tro.training_type}</td>
			
			<td style="background-color: khaki">
				<a href=deleteTrainingRequest/${tro.request_id}>DELETE</a></td>
			<td style="background-color: khaki">
				<a href=editTrainingRequest/${tro.request_id}>EDIT</a></td>
		</tr>
	</c:forEach>
</table>

		
			
			



</body>
</html>



