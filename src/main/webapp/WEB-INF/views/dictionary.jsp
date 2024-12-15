<%--
    Created by IntelliJ IDEA.
    User: admin
    Date: 15/12/2024
    Time: 4:33 PM
    To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="post">
    <h3>Translates English to Vietnamese</h3>
    <label><input type="text" name="word" value="${word}"></label>
    <button type="submit">Translate</button>
    <p>Result: <span>${meaning}</span></p>
</form>
</body>
</html>
