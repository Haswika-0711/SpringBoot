<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="POST" action="/MyApplication/addStudent">
		<table>
			<tr>
				<td>Enter id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Enter age</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form>


</body>
</html>


