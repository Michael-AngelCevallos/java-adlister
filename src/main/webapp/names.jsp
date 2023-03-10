
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/10/23
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
  List<String> names = new ArrayList<>(Arrays.asList(
          "Mike",
          "Justin",
          "Alex",
          "Roman"
  ));
request.setAttribute("names", names);

%>


<html>
<head>
    <title>Title</title>
</head>
<body>


<h3>${names}</h3>


<h3>${names}</h3>
<c:forEach var="name" items="${names}">
    <li>${name}</li>
</c:forEach>

</body>
</html>
