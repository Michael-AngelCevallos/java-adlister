
<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/10/23
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equals("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>

<html>
<head>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>



<div class="container">
    <h1>Log In</h1>
    <form action="/login.jsp" method="POST">
        <div class="form-group my-5">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>

    <%@ include file="partials/footer.jsp"%>
</div>
</body>
</html>
