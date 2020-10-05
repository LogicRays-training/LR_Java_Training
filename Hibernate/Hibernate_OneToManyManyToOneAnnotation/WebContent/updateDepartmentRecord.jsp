<%@page import="com.bean.Dept"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Department Information</title>
</head>
<body>
<%
Dept d=(Dept)request.getAttribute("dinfo");
%>
<form name="frmUpdatedept" method="post" action="DepartmentController">
	<table>
	    <tr>
			<td><input type="hidden" name="deptno" value="<%=d.getDeptno() %>"></td>
		</tr>
		<tr>
			<td>Department Name</td>
			<td><input type="text" name="dname" value="<%=d.getDname() %>"></td>
		</tr>
		<tr>
		    <td></td>
			<td>
				<input type="submit" name="action" value="Update Dept"><br>
                <input type="submit" value="Display All Departments" name="action">
			</td>
		</tr>
	</table>
</form>

</body>
</html>