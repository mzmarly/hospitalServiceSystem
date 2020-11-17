<%-- 
    Document   : Doctors
    Created on : 17 lis 2020, 17:27:45
    Author     : Wiktor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
     <%@ page session="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Clien Page</title>
</head>
<body>

<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>

    <c:forEach items="${doctors}" var="doctors">
        <tr>
            <td>${doctors.name}</td>
            <td>${doctors.age}</td>
            <td>${doctors.email}</td>
                <td>
                   <form name="home" action="home.jsp" method="post">
                        <input type="set up visit" value="ok">
                   </form>
                </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
</f:view>
