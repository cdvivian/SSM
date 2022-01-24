<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--添加jstl核心库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>congratulations！</h1>
<c:forEach items="${movies}" var="movie">
        ${movie.id}-
        ${movie.name}-
        ${movie.actor}-
        ${movie.director}<br>

</c:forEach>

<%--输出查询一个结果--%>
${movie.id}--
${movie.name}--
${movie.director}--
${movie.actor}
</body>
</html>
