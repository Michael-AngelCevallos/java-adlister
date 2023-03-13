<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/10/23
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<html>
<head>
    <title>
        Color Change
    </title>
</head>
<body>

<form method=get action="/viewcolor">

        Select Color :
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="green">Green</option>
            <option value="blue">Blue</option>
            <option value="yellow">yellow</option>
            <option value="black">Black</option>
        </Select>
        <input type="submit" value="Submit">
</form>

</body>

</html>
