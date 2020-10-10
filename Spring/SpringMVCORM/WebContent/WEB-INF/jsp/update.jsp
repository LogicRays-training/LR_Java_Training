<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="insert" method="post" action="update">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="${p.id}"></td>
		</tr>
		<tr>
			<td>Person Name</td>
			<td><input type="text" name="pname" value="${p.pname}"></td>
		</tr>
		<tr>
			<td>Person Address</td>
			<td><input type="text" name="paddress" value="${p.paddress}"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update">
			</td>
		</tr>
	</table>
</form>
<a href="show.jsp">Show All Person</a>
</body>
</html>