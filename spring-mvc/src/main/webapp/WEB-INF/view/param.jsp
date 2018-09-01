<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	时间格式：
	<form action="date" method="post">
		时间:<input type="text" name="date" />
		姓名：<input type="text" name="user" />
		<input type="submit" value="提交" />
	</form>
	<br> 
	
	数字格式：
	<form action="number" method="post">
		数字:<input type="text" name="num" /> 
		姓名：<input type="text" name="user" /><input type="submit" value="提交" />
	</form>

	<br>
	<a href="/requestParam?username=qiqi&pass=qiqi-pass">@RequestParam</a>
	
	<br>
	<br>
	<a href="/cookieValue">@CookieValue</a>


</body>
</html>