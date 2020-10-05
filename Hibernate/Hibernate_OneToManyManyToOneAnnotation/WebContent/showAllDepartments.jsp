<%@page import="com.dao.DeptDao"%>
<%@page import="com.bean.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department List</title>
</head>
<body>
<center>
      <a href="insertDept.jsp">
      Click to Add Department Information.
      </a>
<%
 List<Dept> dlist=DeptDao.getAllDept();
%>
<h1>Department List</h1>
<table border="2">
<tr>
<td>Dept_ID</td>
<td>Dept_Name</td>
<td>EDIT</td>
<td>DELETE</td>
</tr>
<%
  for(Dept d:dlist)
  {
%>
<tr>
<td><%=d.getDeptno() %></td>
<td><%=d.getDname() %></td>
<td>
<form name="frmedit" action="DepartmentController" method="post">
		<input type="hidden" name="deptno" value="<%=d.getDeptno() %>">
		<input class="button" type="submit" name="action" value="edit">
</form>
</td>

<td>
<form name="frmdelete" action="DepartmentController" method="post">
		<input type="hidden" name="deptno" value="<%=d.getDeptno() %>">
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