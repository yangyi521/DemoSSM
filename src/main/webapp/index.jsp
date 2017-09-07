<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertUser.action" method = "post">
 用户名：<input name = "username" id = "password"/></br>
<br/>
 密 码：<input name = "password" id = "password"/><br/>
</br>
<input type="submit" value="提交"/ >
</form>
<form action="deleteUser.action" method = "post">
 id：<input name = "id" id = "id"/></br>

<input type="submit" value="提交"/>
</form>
</body>
</html>