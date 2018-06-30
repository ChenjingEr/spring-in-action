<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(function() {
		$(".delete").click(function() {
			var href = $(this).attr("href");
			$("form").attr("action", href).submit();
			return false;
		});
	})
</script>
</head>
<body>

	<form action="" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>

	<c:if test="${empty requestScope.books}">
		没有图书信息
	</c:if>
	<c:if test="${!empty requestScope.books}"></c:if>
	<table class="tg" border="1">
		<tr>
			<th>ID</th>
			<th>书名</th>
			<th>作者</th>
			<th>价格</th>
			<th>出版社</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<c:forEach items="${requestScope.books}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.bookName}</td>
				<td>${book.authoerName}</td>
				<td>${book.price}</td>
				<td>${book.publishingCompany.companyName}</td>
				<td><a href="/book/${book.id}">修改</a></td>
				<td><a class="delete" href="/book/${book.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<br />

	<a href="book"> New Book</a>

</body>
</html>