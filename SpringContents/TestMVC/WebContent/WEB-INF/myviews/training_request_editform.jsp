<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
<style>
	.x
	{
	background-color: gray;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h1>Edit Training Request </h1>

<Br>

<h1>Add New Employee</h1>  
       <form:form method="post" action="../saveEdit">    
        <table >    
         <tr>    
          	<td>ID: </td>   
          	<td><form:input path="request_id" cssClass="x" readonly="true"/></td>  
         </tr>    
         
         <tr>    
          	<td>PM Name : </td>   
          	<td><form:input path="request_pm_name" cssClass="x" readonly="true" /></td>  
         </tr>
         
          <tr>    
          	<td>Vertical : </td>   
          	<td><form:input path="request_pm_vertical"  cssClass="x" readonly="true" /></td>  
         </tr>
           
          <tr>    
          	<td>Technology : </td>   
          	<td><form:input path="request_technology"  /></td>  
         </tr>
         
          <tr>    
          	<td>Date : </td>   
          	<td><form:input path="request_date"  /></td>  
         </tr>
         
          <tr>    
          	<td>Total Participants : </td>   
          	<td><form:input path="approx_participants"  /></td>  
         </tr>
          <tr>    
          	<td>Location : </td>   
          	<td><form:input path="training_location"  /></td>  
         </tr>
         
          <tr>    
          	<td>Training Type : </td>   
          	<td><form:input path="training_type"  /></td>  
         </tr>
         
         <tr>
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>