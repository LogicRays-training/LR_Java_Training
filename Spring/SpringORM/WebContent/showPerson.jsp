<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.bo.PersonBO"%>
<%@page import="com.bean.Person"%>
<%@page import="java.util.*"%>
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
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	PersonBO pbo=(PersonBO)a.getBean("personBo");
	List<Person> list=pbo.getAllPerson();
%>
<table border="1" width="100%">
	<tr>
		<td>PID</td>
		<td>PNAME</td>
		<td>PADDRESS</td>
		<td>EDIT</td>
		<td>DELETE</td>
	</tr>
	<%
		for(Person p:list)
		{
	%>
	<tr>
		<td><%=p.getPid() %></td>
		<td><%=p.getPname() %></td>
		<td><%=p.getPaddress() %></td>
		<td>
			<form name="edit" method="post" action="PersonController">
				<input type="hidden" name="pid" value="<%=p.getPid()%>">
				<input type="submit" name="action" value="Edit">
			</form>
		</td>
		<td>
			<form name="delete" method="post" action="PersonController">
				<input type="hidden" name="pid" value="<%=p.getPid()%>">
				<input type="submit" name="action" value="Delete">
			</form>
		</td>
	</tr>
	<%		
		}
	%>
</table>
</body>
</html>