<%--
  Created by IntelliJ IDEA.
  User: michael-angelcevallos
  Date: 3/10/23
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--todo Pizza Order Form
A user goes to /pizza-order and sees a pizza order form. This form features choices to select the crust type, sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input). Use System.out.println to output the values submitted by the user.

todo 1- use a POST request on the form
todo 2- use one JSP and one servlet
todo 3- don't worry about styling--%>


<html>
<head>
    <title>Cevallos World</title>
<style>
    h1{
        text-align: center;
        color: red;
    }


</style>

</head>
<body>


<h1>Cevallos Pizza!</h1><br>

<form action="/login.jsp" method="POST">
<h3>Select Crust: </h3>
    <label for="crust"></label>
    <select name="crust" id="crust">
    <option value="hand-tossed">Hand Tossed</option>
    <option value="thin">Thin Crust</option>
    <option value="stuffed">Stuffed Crust</option>
    <option value="gluten">Gluten Free</option>
</select>

<%--Sauce--%>
<h3>Select Sauce: </h3>
    <label>
        <input type="checkbox" value="tomato">
    </label>Tomato</input>
    <label>
        <input type="checkbox" value=Alfredo">
    </label>Alfredo</input>
    <label>
        <input type="checkbox" value="special">
    </label>Special Blend</input>
    <label>
        <input type="checkbox" value="no-sauce">
    </label>None</input>

    <%--Size--%>

<h3>Select Size: </h3>

    <ol>
        <li>Small - "10"</li>
        <li>Medium - "12"</li>
        <li>Large - "14"</li>
        <li>X-Large - "18"</li>
    </ol>
<h4>Enter Your Size: </h4>

    <input type="text" value="">

</input>

<input type="submit" class="btn btn-primary btn-block" value="Submit">

</form>

</body>
</html>
