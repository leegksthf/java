<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h5>원글</h5>
			${list[0].SNo } : ${list[0].SContents }
		</div>
		<br />
		<div>
			<h5>댓글</h5>
			<c:forEach var="reply" items="${list }">
			${reply.CNo } : ${reply.CSubject }
			</c:forEach>
		</div>
	</div>
</body>
</html>