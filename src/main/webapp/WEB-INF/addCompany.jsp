<%--
  Created by IntelliJ IDEA.
  User: ArtPa
  Date: 12.01.2024
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Company
    </title>
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
Add Company <br>
<form method="post" action="/addCompany">
    Company Name: <input type="text" name="companyName"> <br>
    Company Address: <input type="text" name="companyAddress"><br>
    <input type="submit" value="add">
</form>
</body>
</html>
