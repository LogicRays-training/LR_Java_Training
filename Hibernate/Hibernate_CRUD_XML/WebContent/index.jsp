<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="EmployeeController">
	<table cellspacing="5" cellpadding="5">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Insert">
			</td>
		</tr>
		
	   <tr>
       <td></td>
       <td>
       <input type="submit" value="Display All Employee Records" name="action">
       </td>
       </tr>
	</table>
</form>
</body>
</html>