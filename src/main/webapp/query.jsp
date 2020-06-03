<%@ page import="com.hzit.bean.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 李杨林
  Date: 2020/6/1
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table align="center" width="450" border="1">
    <tr>
        <td align="center" colspan="6">
            <h2>所有学生信息</h2>
        </td>
    </tr>
    <tr align="center">
        <td>
            <b>ID</b>
        </td>
        <td>
            <b>学生姓名</b>
        </td>
        <td>
            <b>学生生日</b>
        </td>
        <td>
            <b>学生性别</b>
        </td>
        <td>
            <b>用户名</b>
        </td>
        <td>
            <b>密码</b>
        </td>
    </tr>
    <%
        List<Student> list=(List <Student>)request.getAttribute("list");
        if (list==null||list.size()<1){
            System.out.println("没有数据！");
        }else{
            for(Student student:list){
    %>
    <tr align="center">
        <td><%=student.getId()%></td>
        <td><%=student.getName()%></td>
        <td><%=student.getBirth()%></td>
        <td><%=student.getSex()%></td>
        <td><%=student.getUsename()%></td>
        <td><%=student.getPassword()%></td>
    </tr>
    <%
    }
    }
        %>
</table>
