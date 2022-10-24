<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<h2>My First Web App</h2>
<h2>My First Web App Line 2</h2>
<br/>
<a href="hello-servlet">Hello Servlet</a><br>
<a href="subject_form.html">Add New Subject</a><br>
<a href="TestRequestParameter">Favorite Subjects</a><br>
<a href="SubjectList">Subject List</a><br>
<a href="TestScope">Test Scope (Servlet)</a><br>
<a href="${pageContext.request.contextPath}/test_scope.jsp">Test Scope (JSP)</a><br>
</body>
</html>
