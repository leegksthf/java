<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>부서관리</h3>
<div id="list"></div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
	crossorigin="anonymous"></script>
	
	
	

<script>
$(function(){
	deptList();
	
	//등록
	
	//수정
	
	//목록조회
	function deptList(){
			$.ajax({
				url:"deptList",
				dataType: "json",
				success : function(datas){
					$.each(datas, function(i, data){
						$("<div>").append($("<span>").html(data.department_id))
								  .append($("<span>").html(data.department_name))
								  .appendTo($("#list"));
								  
						
					})
				}
				
			});
	}
})
	
</script>


<div class="modal" tabindex="-1" id="empModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title">Modal title</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<!-- <form>모달 안에 등록 폼 추가하기 </form> -->
				<p>Modal body text goes here.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div>
		</div>
	</div>
</div>