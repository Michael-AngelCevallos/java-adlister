<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/13/23
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<h1> Guess A Number between 1 and 3</h1>

<form action="/guess" method ="POST">
    <select name="number" id="number">
        <option>1</option>
        <option>2</option>
        <option>3</option>
    </select>
    <button>Guess Number</button>
</form>




</body>
</html>
