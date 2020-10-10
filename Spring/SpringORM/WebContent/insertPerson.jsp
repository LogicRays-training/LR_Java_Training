<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="person" method="post" action="PersonController">
	<table>
		<tr>
			<td>Person Name</td>
			<td><input type="text" name="pname"></td>
		</tr>
		<tr>
			<td>Person Address</td>
			<td><input type="text" name="paddress"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Insert">
			</td>
		</tr>
	</table>
</form>
</body>
</html>