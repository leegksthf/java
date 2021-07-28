<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Community</title>

</head>
<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">

		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">커뮤니티 글보기</h1>
		<p class="mb-4"></p>

		<div class="container">
			<h3>글보기</h3>
			<p>작성자 : ${list[0].sName } 작성일자 : ${list[0].sDate }</p>
			<p>${list[0].sContents }</p>
		</div>
	</div>
	<!-- /.container-fluid -->


	<!-- End of Main Content -->