<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Information</title>
</head>
<body>
<form name="emp" method="post" action="EmpController">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" name="uname"></td>
		</tr>
		<tr>
		    <td></td>
			<td>
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