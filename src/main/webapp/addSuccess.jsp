<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
添加成功！！！<br/>


用户列表：
<table width = "100%" border =1>
<tr>
<td>id</td>
<td>username</td>
<td>password</td>
</tr>
<c:forEach items="${userList}" var = "user">
<tr>
<td>${user.id }</td>
<td>${user.username }</td>
<td>${user.password }</td>
</tr>
</c:forEach>

</table>
</body>
</html>