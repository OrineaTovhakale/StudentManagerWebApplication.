<%-- 
    Document   : add_student.jsp
    Created on : May 12, 2025, 9:46:15 PM
    Author     : Ranku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="AddStudentServlet.do" method="post">
    ID: <input type="text" name="id"><br>
    Name: <input type="text" name="name"><br>
    Surname: <input type="text" name="surname"><br>
    Age: <input type="number" name="age"><br>
    Gender: 
    <select name="gender">
        <option value="Male">Male</option>
        <option value="Female">Female</option>
    </select><br>
    Percentage: <input type="number" step="0.01" name="percentage"><br>
    <input type="submit" value="Add Student">
</form>
    </body>
</html>
