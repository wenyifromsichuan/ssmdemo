<%--
  Created by IntelliJ IDEA.
  User: HH
  Date: 2019/7/25
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<body>
<a href="/user/queryAll">查询全部数据</a>
<br>
<form method="post" action="/user/insert">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="插入表单数据"><br>
</form>
</body>
</html>
