<%@page import="com.service.StudentService"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/red.css">
<meta charset="ISO-8859-1">
<title>Student Admission Records</title>
</head>
<body>
<center>
      <a href="../AddRecord_JSP/insertStudentRecord.jsp">
      Click to Add Student Record.
      </a>
 </center>
<%
     ArrayList <Student> li=new ArrayList<>();
     StudentService ss=new StudentService();
     li=ss.findAll();
%>
<center>
<h1>Student Records</h1>
<table class="alternate">
<tr>
    <td>Student ID</td>
    <td>First Name</td>
    <td>Last Name</td>
    <td>Email Id</td>
    <td>Password</td>
    <td>Gender</td>
    <td>Language Known</td>
    <td>Qualification</td>
    <td>Comments</td>

</tr>
<%
for(Student st:li)
{
%>
    <tr>
    <td><%= st.getStudid() %></td>
    <td><%= st.getFname() %></td>
    <td><%= st.getLname() %></td>
    <td><%= st.getEmail() %></td>
    <td><%= st.getPassword() %></td>
    <td><%= st.getGender() %></td>
    <td><%= st.getLangknown() %></td>
    <td><%= st.getQualif() %></td>
    <td><%= st.getComments() %></td>
     <td class="noBorder">
	    <!--  calls a servlet to fetch book by ID and populate EditBook.jsp -->
		<a class="button"  href="${pageContext.request.contextPath}/StudentController?id=<%=st.getStudid() %>">edit</a>
	</td>	
      <td class="noBorder">
		<form name="frmdelete" action="${pageContext.request.contextPath}/StudentController" method="post">
		<input type="hidden" name="id" value="<%=st.getStudid() %>">
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