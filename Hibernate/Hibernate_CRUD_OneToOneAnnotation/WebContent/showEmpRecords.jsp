<%@page import="com.bean.Emp"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.EmpInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Records</title>
</head>
<body>
<center>
      <a href="index.jsp">
      Click to Add Employee Information.
      </a>
<%
List<Emp> emp_li=EmployeeDao.getAllEmpRecords();
%>

<h1>Employee Records</h1>
<table border="2">
<tr>
<td>EMPID</td>
<td>FIRST_NAME</td>
<td>LAST_NAME</td>
<td>USERNAME</td>
<td>EDIT</td>
<td>DELETE</td>
</tr>
<%
   for(Emp e:emp_li)
   {
%>
<tr>
<td><%= e.getEid() %></td>
<td><%= e.getEinfo().getFname() %></td>
<td><%= e.getEinfo().getLname() %></td>
<td><%= e.getUname() %></td>
<td>
<form name="frmedit" action="EmpController" method="post">
		<input type="hidden" name="eid" value="<%=e.getEid() %>">
		<input class="button" type="submit" name="action" value="edit">
</form>
</td>

<td>
<form name="frmdelete" action="EmpController" method="post">
		<input type="hidden" name="eid" value="<%=e.getEid() %>">
		<input class="button" type="submit" name="action" value="delete">
</form>
</td>
</tr>

<%
   }
%>
</table>
</center>
</body>
</html>