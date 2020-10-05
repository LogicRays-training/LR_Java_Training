<%@page import="java.util.List"%>
<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.EmployeeBean"%>
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
    List <EmployeeBean> elist=new ArrayList<>();
    elist=EmployeeDao.displayAllRecords();
%>
<h1>Employee Records</h1>
<table border="2">
<tr>
<td>EMPID</td>
<td>FIRST_NAME</td>
<td>LAST_NAME</td>
<td>EMAIL ID</td>
<td>MOBILE NO</td>
<td>EDIT</td>
<td>DELETE</td>
</tr>
<%
   for(EmployeeBean e:elist)
   {
%>
<tr>
<td><%= e.getEmpid() %></td>
<td><%= e.getFname() %></td>
<td><%= e.getLname() %></td>
<td><%= e.getEmail() %></td>
<td><%= e.getMobile() %></td>
<td>
<form name="frmedit" action="EmployeeController" method="post">
		<input type="hidden" name="empid" value="<%=e.getEmpid() %>">
		<input class="button" type="submit" name="action" value="edit">
</form>
</td>

<td>
<form name="frmdelete" action="EmployeeController" method="post">
		<input type="hidden" name="empid" value="<%=e.getEmpid() %>">
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