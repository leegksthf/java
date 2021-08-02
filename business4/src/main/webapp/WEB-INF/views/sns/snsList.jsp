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
		<div class="table-responsive">
				<table class="table table-bordered table-hover" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>순번</th>
							<th>제목</th>
							<th>작성일자</th>
							<th>작성자</th>
							<th>댓글수</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="sns" items="${list }">
						<tr onclick="getRecord(${sns.sNo })">							
								<td>${sns.sNo }</td>
								<td>${sns.sTitle }</td>
								<td>${sns.sDate }</td>
								<td>${sns.sWriter }</td>
								<td>${sns.sAno}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
	</div><br/>
	<div>
		<button type = "button" onclick="location.href='home.do'">홈 가기</button> &nbsp;&nbsp;&nbsp;
		<button type = "button" onclick="location.href='snsInsertForm.do'">새글작성</button>
	</div>
	<div>
		<form id="frm" name="frm" action="snsSelect.do" method="post">
			<input type="hidden" id="sNo" name="sNo">
		</form>
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