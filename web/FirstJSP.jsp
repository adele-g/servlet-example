<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstJSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <%----//<%%> //не возвращает--%>
    <p>
        <%--<%@ page import="logic.Message" %>--%>
        <%--<% Message message = new Message();%>--%>
        <%
            String name = request.getParameter("name");
        %>
        <%= "Hello " + name%>
    </p>
</body>
</html>
