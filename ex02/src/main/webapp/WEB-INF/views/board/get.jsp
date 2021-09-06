<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시글 상세보기</h3>
	<table border="1">
		<tr>
			<td>제목</td>
			<td>${board.title }</td>
	</table>
	<form action="modify" method="post">
		<input type="hidden" name="pageNum" value="${cri.pageNum}">
		<input type="hidden" name="amount" value="${cri.amount}">
		
		<button>수정</button>
		<button>삭제</button>
		<a class="btn btn-success"
			href="list?pageNum=${cri.pageNum}&amount=${cri.amount}">목록으로</a>
	</form>
</body>
</html>