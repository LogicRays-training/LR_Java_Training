<%@page import="com.spring.Person"%>
<%@page import="com.bo.PersonBO"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	PersonBO pbo=(PersonBO)a.getBean("personBo");
	List<Person> list=pbo.getAllPerson();
%>
<table border="1">
	<tr>
		<td>ID</td>
		<td>Person Name</td>
		<td>Person Address</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<%
		for(Person p:list)
		{
	%>
	<tr>
		<td><%=p.getId() %></td>
		<td><%=p.getPname() %></td>
		<td><%=p.getPaddress() %></td>
		<td>
			<form name="edit" method="post" action="edit">
				<input type="hidden" name="id" value="<%=p.getId()%>">
				<input type="submit" name="action" value="Edit">
			</form>
		</td>
		<td>
			<form name="delete" method="post" action="delete">
				<input type="hidden" name="id" value="<%=p.getId()%>">
				<input type="submit" name="action" value="Delete">
			</form>
		</td>
	</tr>
	<%		
		}
	%>
</table>
<a href="insert1">Add New Person</a>
</body>
</html>