<%--
  Created by IntelliJ IDEA.
  User: INT202&INT204
  Date: 8/29/2022
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Favorite Subject</title>
</head>
<body>
    <h3>Your Favorite Subjects</h3><hr/>
    <form action="TestRequestParameter" method="post">
        Your name: <input type="text" name="name"/><br>
        Your grade: <input type="number" name="grade"/><br>
        Favorite Subjects: <br>
        <input type="checkbox" name="fav_subjects" value="INT100">INT 100 - IT Fundamentals<br>
        <input type="checkbox" name="fav_subjects" value="INT101">INT 101 - Programming Fundamentals<br>
        <input type="checkbox" name="fav_subjects" value="INT102">INT 102 - Web Technology<br>
        <input type="checkbox" name="fav_subjects" value="INT114">INT 114 - Discrete Mathematics<br>
        <input type="checkbox" name="fav_subjects" value="GEN101">GEN 101 - Physical Education<br>
        <input type="checkbox" name="fav_subjects" value="GEN111">GEN 111 - Man and Ethics of Living<br>
        <input type="checkbox" name="fav_subjects" value="LNG120">LNG 120 - General English<br>
        <input type="submit">
    </form>
    <hr/>
    Favorite Subject for ${param.name} (Grade: ${param.grade})::<br>
    <c:forEach items="${paramValues.fav_subjects}" var="paramValue">
        &nbsp; &nbsp; &nbsp; ${paramValue} <br>
    </c:forEach>
    <br><hr/>
    <a href="index.jsp">[ Home ]</a>
</body>
</html>
