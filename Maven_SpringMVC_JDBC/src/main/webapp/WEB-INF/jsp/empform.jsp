<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Employee</h1>
	<form method="post" action="save">
		<table>
			<tr>
				<td>Enter your name</td>
				<td><input type="text" name="name">
			</tr>

			<tr>
				<td>Enter your salary</td>
				<td><input type="text" name="salary">
			</tr>


			<tr>
				<td>Enter your designation</td>
				<td><input type="text" name="designation">
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="SUBMIT" /></td>
			</tr>
		</table>


	</form>

</body>
</html>



