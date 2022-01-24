<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="moviesController/findAll">查询所有电影</a><br>

根据id查询
<form action="moviesController/findOne">
    id:<input type="text" name="id"><br>
    <input type="submit" value="提交">
</form><br>

添加电影
<form action="moviesController/addMovie">
    name:<input type="text" name="name"><br>
    director:<input type="text" name="director"><br>
    actor:<input type="text" name="actor"><br>
    <input type="submit" value="提交">
</form><br>


修改电影
<form action="moviesController/modifyMovie">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    director:<input type="text" name="director"><br>
    actor:<input type="text" name="actor"><br>
    <input type="submit" value="提交">
</form><br>


删除电影
<form action="moviesController/deleteMovie">
    id:<input type="text" name="id"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
