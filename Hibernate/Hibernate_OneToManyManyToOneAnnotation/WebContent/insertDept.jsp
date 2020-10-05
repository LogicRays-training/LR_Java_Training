<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department Information Form</title>
</head>
<body>
<form name="frmdept" method="post" action="DepartmentController">
	<table>
		<tr>
			<td>Department Name</td>
			<td><input type="text" name="dname"></td>
		</tr>
		<tr>
		    <td></td>
			<td>
				<input type="submit" name="action" value="Insert Dept"><br>
                <input type="submit" value="Display All Departments" name="action">
			</td>
		</tr>
	</table>
</form>

</body>
</html>