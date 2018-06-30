<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath }/book" method="POST" modelAttribute="book">

		<c:if test="${book.id == null }">
			BookName:<form:input path="bookName" />
		</c:if>
		<c:if test="${book.id != null }">
			<form:hidden path="id" />
			<input type="hidden" name="_method" value="PUT" />
		</c:if>

		<br />
		AuthoerName:<form:input path="authoerName" />
		<br />
		Price:<form:input path="price" />
		<br />
		PublishingCompany:<form:select path="publishingCompany.id"
			items="${companys}" itemLabel="companyName" itemValue="id"></form:select>
		<br />
		<input type="submit" value="submit">

	</form:form>

</body>
</html>