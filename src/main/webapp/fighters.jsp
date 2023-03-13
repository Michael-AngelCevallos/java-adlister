
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="fighter" items="${fighters}">
  <p>${fighter.name} has ${fighter.hitPoints} hit points</p>
</c:forEach>


</body>
</html>
