<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<% EmployeeBean e =(EmployeeBean)request.getAttribute("emp"); %>
<form name="frm" method="post" action="EmployeeController">
	<table cellspacing="5" cellpadding="5">
	<tr>
	
			<td><input type="hidden" name="empid" value="<%= e.getEmpid() %>"></td>
	</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%= e.getFname() %>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%= e.getLname() %>" ></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%= e.getEmail() %>"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" value="<%= e.getMobile() %>"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update Record">
			</td>
		</tr>
	</table>
</form>
</body>
</html>