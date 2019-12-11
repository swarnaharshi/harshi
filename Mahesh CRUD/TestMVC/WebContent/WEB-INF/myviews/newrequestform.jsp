<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New Training Request Form</h1>
<br>

<table style="border-color: navy;" colspan="4" rowspan="4">
	<form action="savenewrequest">
		<tr>
			<td>Name</td>
			<td><input type="text" name="pm_name"/></td>
		</tr>
		<tr>
			<td>Vertical</td>
			<td><Select name="v_name">
					<option>BNFS</option>
					<option>RLT</option>
					<option>MFG</option>
					<option>HC</option>
				</Select></td>
		</tr>
		<tr>
			<td>Technology</td>
			<td><Select name="t_name">
					<option>Java</option>
					<option>Oracle</option>
					<option>Dot Net</option>
					<option>Selenium</option>
				</Select></td>
		</tr>
		<tr>
			<td>Request Date</td>
			<td><input type="date" name="req_date"/></td>
		</tr>
		<tr>
			<td>No of Participants</td>
			<td><input type="number" name="app_num"/></td>
		</tr>
		<tr>
			<td>Location</td>
			<td><Select name="loc_name">
					<option>Chennai</option>
					<option>Mumbai</option>
					<option>Pune</option>
					<option>Onsite</option>
				</Select></td>
		</tr>
		<tr>
			<td>Training Type</td>
			<td><Select name="trng_type">
					<option>CR</option>
					<option>Virtual</option>
					<option>Conference</option>
				</Select></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="Submit" value="Save...."/></td>
		</tr>
	</form>
</table>


</body>
</html>