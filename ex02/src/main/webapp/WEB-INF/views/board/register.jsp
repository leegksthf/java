<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/WEB-INF/views/includes/header.jsp"%>

	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">게시글 등록</h1>
	</div>
	<form action="register" id="frm" method="post">
		<input name="writer" value="${board.writer}"/>
		<input name="title" value="${board.title}"/>
		<input name="content" value="${board.content}"/>
		<button type="button" id="btnRegister">등록</button>
	</form>
	
	<input type="file" name="uploadFile" multiple="multiple"/>
	<button type="button" id="uploadBtn">첨부파일등록</button>
	<ul id="uploaded"></ul>
</div>

<script>
$(function(){
	
	var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");			//회원가입, 등록 등에 자주 쓰임
	var maxSize = 5242880; //5MB

	function checkExtension(fileName, fileSize) {

		if (fileSize >= maxSize) {
			alert("파일 사이즈 초과");
			return false;
		}

		if (regex.test(fileName)) {
			alert("해당 종류의 파일은 업로드할 수 없습니다.");
			return false;
		}
		return true;
	}
	
	$("#uploadBtn").on("click", function(e){
		var formData = new FormData(document.frm);
		var inputFile = $("input[name='uploadFile']"); //form을 감싸고 document.frm만 해주면 주석된 부분 일일이 안써줘도 됨??
		var files = inputFile[0].files;
		for(i=0; i<files.length; i++){
			if( !checkExtension(files[i].name, files[i].size))
				return;
			formData.append("uploadFile", files[i]);	
		}
		//formData
		$.ajax({
			processData : false,	//필수
			contentType : false,	//필수
			url: "../uploadAjaxAction",
			data: formData,
			method: "post",
			success : function(datas){
				var str = "";
				for(i=0; i<datas.length; i++){
					var obj = datas[i];
					var fileCallPath =  encodeURIComponent( obj.uploadPath+"/"+ obj.uuid +"_"+obj.fileName);			      
				    var fileLink = fileCallPath.replace(new RegExp(/\\/g),"/");
				      
					str += "<li"
					str += "data-path='"+obj.uploadPath+"' data-uuid='"+obj.uuid+"' data-filename='"+obj.fileName+"' data-type='"+obj.image+"' ><div>";
					str += "<span> "+ obj.fileName+"</span>";
					str += "<button type='button' data-file=\'"+fileCallPath+"\' data-type='file' " 
					str += "class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
					str += "<img src='../resources/img/attach.png'></a>";
					str += "</div>";
					str + "</li>";
				}
				$("#uploaded").html(str);
				alert("uploaded");
			}
		});
	});
	
	//등록버튼 이벤트
	$("#btnRegister").on("click", function(){
		var str = "";
		$("#uploaded li").each(function(i, obj){
			var jobj = $(obj);
			  str += "<input type='hidden' name='attachList["+i+"].fileName' value='"+jobj.data("filename")+"'>";
		      str += "<input type='hidden' name='attachList["+i+"].uuid' value='"+jobj.data("uuid")+"'>";
		      str += "<input type='hidden' name='attachList["+i+"].uploadPath' value='"+jobj.data("path")+"'>";
		      str += "<input type='hidden' name='attachList["+i+"].fileType' value='1'>"   //"+ jobj.data("type")+"'>";
		});
		$("#frm").append(str).submit();
	})
});

</script>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>