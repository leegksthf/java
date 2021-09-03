<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<div class="panel panel-default">
		
			<div class="panel-heading">게시글 등록</div>
			<!-- /.pannel-heading -->
			<div class="panel-body">
			
				<form role="form" action="/board/register" method="post">
					<div class="form-group">
						<label>Title</label>
						<input class="form-control" name='title'>
							</div>
							
							<div class="form-group">
								<label>Text area</label>
								<textarea class="form-group" rows="3" name='content'></textarea>
							</div>
							
							<div class="form-group">
								<label>Writer</label>
								<input class="form-control" name='writer'>
							</div>
							<button type="submit" class="btn btn-default">등록</button>
							<button type="reset" class="btn btn-default">reset</button>
				</form>
				
			</div>
			<!-- end panel-body -->
		
		</div>
		<!-- end panel-body -->
	</div>
	<!-- end panel -->
</div>
<!-- /.row -->
<%@include file="/WEB-INF/views/includes/footer.jsp"%>