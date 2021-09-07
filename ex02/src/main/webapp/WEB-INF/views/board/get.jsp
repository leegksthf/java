<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>

	<div class="col-lg-12">
	<h3>게시글 상세보기/수정</h3>
	<table border="1">
		<tr>
			<td>제목</td>
			<td>${board.title }</td>
	</table>
	<form action="modify" method="post">
<%--		<input type="hidden" name="pageNum" value="${cri.pageNum}">
		<input type="hidden" name="amount" value="${cri.amount}"> --%>
		<input name="bno" value="${board.bno}"/>
		<input name="writer" value="${board.writer}"/>
		<input name="title" value="${board.title}"/>
		<input name="content" value="${board.content}"/>
		<button>수정</button>
		<button>삭제</button>
		<a class="btn btn-success"
			href="list?pageNum=${cri.pageNum}&amount=${cri.amount}">목록으로</a>
	</form>
</div>
<!-- 댓글등록 -->
<div class="panel-heading">
	<form id="replyForm">
		<input type="hidden" name="bno" value="${board.bno}" }>
		<input name="replyer" value="user10">
		<input name="reply">
		<button type="button" id="saveReply">댓글등록</button>
	</form>
</div>
<!-- 댓글 목록 -->
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">댓글</h1>
		<ul class="chat">
			
		</ul>
	</div>
</div>
<script src="../resources/js/reply.js"></script>
<script>
	let bno = "${board.bno}";
	$(function(){
		
		//등록처리
		$("#saveReply").on("click", function(){
			replyService.add(function(data){
				$(".chat").append(makeLi(data));
			});
	});
		
		//목록조회
		replyService.getList({bno:bno}, listCallback)
		
		function listCallback(datas){
			var str = "";
			for(i=0; i<datas.length; i++){
				str += makeLi(datas[i]);
			}
			$(".chat").html(str);
		}
		
		//댓글 태그 만들기
		function makeLi(data){
			return '<li class="left clearfix">'
					+ '	<div>'
					+ '		<div class="header">'
					+ '		<strong class="primary-font">'+ data.replyer +'</strong>'
					+ '			<small class="pull-right text-muted">'+ data.replydate +'</small>'
					+ '		</div>'
					+ '		<p>'+ data.reply +'</p>'
					+ '	</div>'			
					+ '</li>'
		}
		
		});

</script>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>