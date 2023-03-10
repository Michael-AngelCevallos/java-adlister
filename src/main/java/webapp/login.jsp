<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/9/23
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Get param values--%>
<%--if username is "admin" and password is "password" redirect to profile--%>
<%--otherwise redirect back to login.jsp--%>

<%

String method = request.getMethod();

if(method.equals("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
}
%>



<!doctype html>
<html>
<head>
    <title>Include Example</title>
</head>
<body>



<h1>Welcome To The Site!</h1>

<form method="POST" action="/login.jsp">

     <label for="username">Enter a Username:</label>
    <input type="text" id="username" name="username"><br>

   <label for="password"> Enter Password: </label>
    <input type="password" id="password" name="password"><br>

    <button>Login</button>

</form>

</body>
</html>