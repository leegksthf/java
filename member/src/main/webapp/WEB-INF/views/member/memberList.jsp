<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<div align="center">
	<div><h1>회원목록 리스트</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="150">아 이 디</th>
				<th width="150">패스워드</th>
				<th width="150">이   름</th>
				<th width="150">나   이</th>
				<th width="200">취   미</th>
			</tr>
			<c:forEach  var="member" items="${list }">
				<tr>
					<td align="center">${member.id }</td>
					<td align="center">${member.password }</td>
					<td align="center">${member.name }</td>
					<td align="center">${member.age }</td>
					<td align="center">${member.hobby }</td>
				</tr>
			</c:forEach>
		</table>
	</div><br/>
	<div><h4><button type="button" onclick="location.href='main.do'">홈 가기</button></h4></div>
</div>
</body>
</html>