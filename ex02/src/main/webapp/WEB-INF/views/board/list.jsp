<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>
	<!-- 헤더에 한 번만 넣어주면 다 적용됨. -->
    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath }/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">
    <!-- DataTables Responsive CSS -->
    <link href="${pageContext.request.contextPath }/resources/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">
	 <!-- DataTables JavaScript -->
    <script src="${pageContext.request.contextPath }/resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath }/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/resources/vendor/datatables-responsive/dataTables.responsive.js"></script>


<div class="row">
	<div class="col-lg-12">
		<h2 class="page-header">게시판</h2>
	</div>
	<!-- /.col-lg-12 -->
	
	<table class="table" id="board">
	<thead>
		<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성일자</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="board">		<!-- c:foreach는 배열, map에 저장돼있는 값들만큼 반복해서 처리할 수 있는 태그 -->	
			<tr>
				<td>${board.bno }</td>
				<td><a href="get?bno=${board.bno}">${board.title }</a></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate }" /></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
		<button type="button" onclick="location.href='register.jsp' " class="btn btn-default">등록</button>
</div>
<script>
$(function(){  
	$("#board").DataTable();	
})
</script>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>