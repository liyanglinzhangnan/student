<%--
  Created by IntelliJ IDEA.
  User: 李杨林
  Date: 2020/6/2
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

<form action="/selectStu" method="get" >


    <select name="student">

        　　<option value="name" name="name">学生姓名</option>

        　　<option value="id" name="id">学生学号</option>

        　　</select>
    输入查询条件:<input type="text" name="select" id="select" />


    <input type="submit" name="select1" id="select1" value="查询" />
</form>


</body>

</html>