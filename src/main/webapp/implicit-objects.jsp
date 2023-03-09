<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/9/23
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- THIS CODE NORMALLY GOES IN A SERVLET (begin)--%>
<%=
       String myName = ("Mike");
       request.setAttribute("myName", myName);
       String method = request.getMethod();
       if(method.equals("GET")){
            request.setAttribute("message", "The method is GET");
       }else if (method.equals("POST")){
            request.setAttribute("message", "The method is POST");

 %>


<html>
<head>
    <title></title>
</head>
<body>

<h1>Welcome To The Site!</h1>

<h1> <%=request.getAttribute("message")%> </h1>


<p>Path : <%= request.getRequestURL()%></p>
<p>Query String: <%=request.getQueryString() %> </p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod()%></p>
<p>User-agent header: <%= request.getHeader("user-agent")%></p>


<form method="POST" action="/implicit-objects.jsp">
    <input type="text" name="someInput">
    <button>Submit</button>
</form>


</body>
</html>
