<%@page import="com.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee Information</title>
</head>
<body>
<%
Emp e=(Emp)request.getAttribute("emp");
%>
<form name="empupdate" method="post" action="EmpController">
	<table>
	    <tr>
			<td><input type="hidden" name="einfo" value="<%= e.getEinfo().getEinfo()%>"></td>
			<td><input type="hidden" name="eid" value="<%= e.getEid()%>"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%= e.getEinfo().getFname()%>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%= e.getEinfo().getLname()%>"></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" name="uname" value="<%= e.getUname()%>"></td>
		</tr>
		<tr>
		    <td></td>
			<td>
				<input type="submit" name="action" value="Update">
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
