<%@page pageEncoding="UTF-8" %>
<form action="/addStu" method="get">
    <table align="center" width='450' >
        <tr>
            <td align="center" colspan="2">
                <h2>
                    添加学生信息
                    <hr>
                </h2>
            </td>
        </tr>
        <tr>
            <td align="right">ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td align="right">姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td align="right">生日:</td>
            <td><input type="text" name="birth"></td>
        </tr>
        <tr>
            <td align="right">性别:</td>
            <td><input type="text" name="sex"></td>
        </tr>
        <tr>
            <td align="right">用户名:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td align="right">密码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" name="添加">
            </td>
        </tr>
    </table>
</form>