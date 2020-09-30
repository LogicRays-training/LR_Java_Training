<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student profile page</title>
</head>
<body>
<%
Student s=null;
if(session!=null)
{
    if (((Student)session.getAttribute("user"))!=null)
     {
	     s=(Student)session.getAttribute("user");
            %>
          <h1>welcome<%=s.getFname() %> <%=s.getLname()%></h1>
            <% 
     }
     else
     {
	     response.sendRedirect("login.jsp");
     }
}
else
{
	response.sendRedirect("login.jsp");
}

%>
<form action="${pageContext.request.contextPath}/StudentController" method="post">
<input type="submit" name="action" value="Logout">
</form>
</body>
</html>