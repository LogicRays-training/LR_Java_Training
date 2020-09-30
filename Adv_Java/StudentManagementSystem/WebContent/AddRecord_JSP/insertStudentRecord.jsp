<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Application</title>
</head>
<body>
<center>
<h1>Student Registration Form</h1>
<form name="frmstd_reg" action="${pageContext.request.contextPath}/StudentController" method="post">
<table>
       <tr>
        <td>Enter First Name</td>
        <td><input type="text" name="fname" ></td>  
        </tr>
        <tr>
        <td>Enter Last  Name</td>
        <td><input type="text" name="lname" ></td>  
        </tr>
        <tr>
        <td>Enter Email Id</td>
        <td><input type="email" name="email" ></td>  
        </tr>
        <tr>
        <td>Enter Password</td>
        <td><input type="password" name="password" ></td>  
       </tr>
       <tr>
        <td>Select Gender</td>
        <td>
             <input type="radio" name="gender" value="male">Male<br>
             <input type="radio" name="gender" value="female">Female<br>
             <input type="radio" name="gender" value="other">Other
        </td>  
       </tr>
        <tr>
        <td>Select Qualification</td>
        <td>
             <select name="qualif">
             <option>BE</option>
             <option>BCA</option>
             <option>BTech</option>
             </select>
        </td>  
       </tr>
        <tr>
        <td>Language Known</td>
        <td>
             <input type="checkbox" name="langknown1" value="English">English<br>
             <input type="checkbox" name="langknown2" value="Hindi">Hindi<br>
             <input type="checkbox" name="langknown3" value="Marathi">Marathi
        </td>  
       </tr>
        <tr>
        <td>Add Extra Points</td>
        <td>
            <textarea rows="5" cols="20" name="comments">Type here...</textarea>
        </td>  
       </tr>
        <tr>
        <td></td>
        <td>
             <input type="submit" name="action" value="Insert Record">
             <input type="reset" name="action" value="RESET">
             
        </td>         
       </tr>
       <tr>
       <td></td>
       <td>
       <input type="submit" value="Display Student Records" name="action">
       </td>
</tr>
</table>
</form>
</center>
</body>
</html>