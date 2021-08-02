<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


  <head>
    <title>Podcast &mdash; Colorlib Website Template</title>
    <script type = "text/javascript">
	function getRecord(n){
		frm.sNo.value = n;
		frm.submit();
	}
</script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,700,900"> 
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/mediaelementplayer.min.css">


    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">
    
  </head>
  <body>
  
  <div class="site-wrap">

    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div>

    <div class="site-blocks-cover inner-page-cover bg-light mb-5">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-12 text-center">
            <h1 class="mb-0">Notice</h1>
            <a href="#">Home</a><span class="mx-2">&bullet;</span> About Us
          </div>
        </div>
      </div>
    </div>
    
    <div class="site-section pt-3">
     
    

    <div class="site-section pt-3">
      <div class="container">
        <div align="center">
<div class="col-md-12 text-center mb-5">
            <h2 class="display-5 mb-5 text-black">공지사항 목록</h2>
          </div>
	<div>
		<div class="container">
			<form id="frm" name="frm" action="insertComment.do" method="post">
					<h3>글보기</h3>
					<p>작성자 : ${list[0].sWriter } 작성일자 : ${list[0].sDate }</p>
					<p>${list[0].sContents  }</p>
					
					<p>댓글 작성자 : ${list[0].cName } 작성일자 : ${list[0].cDate }</p>
					<p>${list[0].cSubject  }</p>
					
			<div>
	
		<table border="1">
			<tr>
				<th width="100">작성자</th>
				<td width="150" ><input type="text" id="cName" name="cName" required="required" value="${name}" ></td>
			</tr>
			<tr>
				<th width="100">내용</th>
				<td colspan="3">
					<textarea rows="7" cols="65" id="cSubject" name="cSubject" required="required" placeholder="여기다 내용을 써 주세요"></textarea>
				</td>
			</tr>
		</table>	
	
	</div><br/>
	
	<div>
	<button type="button" onclick="location.href ='insertComment.do?sNo=${list[0].sNo }'">등록</button>
		<button type="submit" >등록</button>&nbsp;&nbsp;&nbsp;
		<button type="reset">취소</button>&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="location.href ='snsList.do'">목록</button>
	</div>
	</form>
	</div>		
					
		</div>
	</div><br/>
	<div>
		<button type = "button" onclick="location.href='home.do'">홈 가기</button> &nbsp;&nbsp;&nbsp;
	<c:if test="${ name eq list[0].sWriter }"><button type="button" onclick="location.href ='snsUpdateForm.do?sNo=${list[0].sNo }'">수정</button></c:if>&nbsp;&nbsp;&nbsp;
		<c:if test="${name eq list[0].sWriter }"><button type="button" onclick="location.href ='deleteSns.do?sNo=${list[0].sNo }'">삭제</button></c:if>
	</div>
	
</div>
    </div>
    
  

    
  </div>

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/jquery.countdown.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/mediaelement-and-player.min.js"></script>

  <script>
      document.addEventListener('DOMContentLoaded', function() {
                var mediaElements = document.querySelectorAll('video, audio'), total = mediaElements.length;

                for (var i = 0; i < total; i++) {
                    new MediaElementPlayer(mediaElements[i], {
                        pluginPath: 'https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/',
                        shimScriptAccess: 'always',
                        success: function () {
                            var target = document.body.querySelectorAll('.player'), targetTotal = target.length;
                            for (var j = 0; j < targetTotal; j++) {
                                target[j].style.visibility = 'visible';
                            }
                  }
                });
                }
            });
    </script>


  <script src="js/main.js"></script>
    
  </body>
</html>