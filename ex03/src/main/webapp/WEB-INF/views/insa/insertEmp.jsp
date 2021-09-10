<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<style>
	.require {
		color : red;
	}
	.emp{
		cursor: pointer;
	}
	
	.emp:hover {
		color: blue;
	}
	
</style>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
	crossorigin="anonymous"></script>
<script>
$(function(){
	function validation(){
		if(frm.last_name.value == ""){
			alert("이름입력");
			frm.last_name.focus();
			return false;
		}
		return true;
	}
	//등록버튼
	$("#btnRegister").on("click", function(){
		if(validation()){
			frm.submit();
		}
	})
	
	//매니저 검색
	$("#btnEmpSearch").on("click", function(){
		//검색페이지를 ajax -> 모달 바디에 넣고 -> 모달 띄움
		$.ajax({
			url: "empSearch",
			success : function(data){
				$("#empModal .modal-body").html(data);
				$('#empModal').modal('show');
			}
		});
	});
	
	//매니저 단건검색
	$("#manager_id").on("keydown", function(e){
		$('#name').val("");
		if($("manager_id").val()=="")
			
			
		if(e.keyCode == 13){
			e.preventDefault();
			$.ajax({
				url: "ajaxEmp",
				data: {employee_id : $("#manager_id").val()},
				success : function(data){
					if(data){
						$("#name").val(data.first_name)
					} else{
						$("#btnEmpSearch").click();
					}
			
				}
			});
		}
	})
});
</script>
<h1>사원등록</h1>
<form name="frm" action="${not empty emp ? 'insertEmp' : 'updateEmp'}" method="post">
	<c:if test="${not empty emp}">
		<input name="employee_id" value="${emp.employee_id }">
	</c:if>
	firstName <span class="require">*</span><input name="first_name" value="${emp.first_name}"><br> 
	lastName<input name="last_name"><br> 
	email<span class="require">*</span><input name="email" value="${emp.email}"><span id="result"></span> <br>
	phoneNumber<input name="phone_number" value="${emp.phone_number}"><br> 
	hireDate<span class="require">*</span><input name="hire_date" value="${emp.hire_date}"><br> 
	jobid<span class="require">*</span><select name="job_id">
		<option value="">선택</option>
		<c:forEach items="${opt.jobs}" var="job">
			<option value="${job.job_id}">${job.job_title}</option>
		</c:forEach>
	</select><br> salary<input name="salary"><br> commissionPct<input
		name="commission_pct"><br> manageId<input
		name="manager_id" id="managerId"><input id="name">
	<button type="button" class="btn btn-primary" id="btnEmpSearch">
		검색</button>
	<br> departmentId<select name="department_id">
		<option value="">선택</option>
		<c:forEach items="${opt.depts}" var="dept">
			<option value="${dept.department_id}">${dept.department_name}</option>
		</c:forEach>
	</select><br>
	<button type="button" id="btnRegister">등록</button>
</form>

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