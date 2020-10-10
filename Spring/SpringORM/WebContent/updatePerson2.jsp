<%@page import="com.bean.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Person p=(Person)request.getAttribute("p");
%>
<form name="person" method="post" action="PersonController">
	<table>
		<tr>
			<td><input type="hidden" name="pid" value="<%=p.getPid()%>"></td>
		</tr>
		<tr>
			<td>Person Name</td>
			<td><input type="text" name="pname" value="<%=p.getPname()%>"></td>
		</tr>
		<tr>
			<td>Person Address</td>
			<td><input type="text" name="paddress" value="<%=p.getPaddress()%>"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update">
			</td>
		</tr>
	</table>
</form>
</body>
</html>