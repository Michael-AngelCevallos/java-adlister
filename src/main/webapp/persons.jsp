<%@ page import="model.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/10/23
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
Person p1 = new Person("Fred Smith", 24);
Person p2 = new Person("Sally Smith", 34);
Person p3 = new Person("Andy Smith", 14);

  List<Person> people = new ArrayList<>(Arrays.asList(
          p1,
          p2,
          p3

  ));
request.setAttribute("people", people);

%>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>People</h1>

<c:choose>

    <c:when test="${people.isEmpty()}">
        <h3>No People</h3>
    </c:when>

    <c:otherwise>
        <c:forEach var="person" items="${people}">
            <h3>
                    ${people.name}
                <c:if test = "${person.age < 21}">
                (minor)
                </c:if>
            </h3>
        </c:forEach>
    </c:otherwise>

</c:choose>








</body>
</html>
