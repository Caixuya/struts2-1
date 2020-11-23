<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>
<hr/>
<form action="login" method="post">
username:<input type="text" name="username"/><br><br>
password:<input type="password" name="password"/><br><br>
<input type="submit" value="登录"/>
</form>
<s:property value="message"/>
</body>
</html>