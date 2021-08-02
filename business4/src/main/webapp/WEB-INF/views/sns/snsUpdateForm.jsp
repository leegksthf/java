<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


  <head>
    <title>Podcast &mdash; Colorlib Website Template</title>
    <script type = "text/javascript">
	function getRecord(n){
		frm.bId.value = n;
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
	   <div><h1>게시글 상세 보기</h1></div>
      <form id="frm" name="frm" action="updateSns.do" method="post">
      <div>
         <table border="1">
            <tr>
               <th width="100">글 번호</th>
               <td width="70" align="center">${sns.sNo }<input type="hidden" id="bId" name="bId" value="${board.bId }"></td>
               <th width="100">작성자</th>
               <td width="150" align="center">${sns.sWriter }</td>
               <th width="100">작성일자</th>
               <td width="150" align="center">${sns.sDate }</td>
              
            </tr>
            <tr>
               <th width="100">글 제목</th>
                     <td colspan="7"><input type="text" id="bTitle" name="bTitle"
                        size="60" required="required" value="${sns.sTitle }"></td>
            </tr>
            <tr>
               <th width="100">글 내용</th>
                     <td colspan="7"><textarea rows="7" cols="65" id="bContent"
                           name="bContent" required="required">${sns.sContents }</textarea></td>
            </tr>
         </table>
       
      </div><br>
      <div>
         <button type="button" onclick="location.href='boardList.do'">목록</button> &nbsp;&nbsp;&nbsp;
         <!-- <button type="button" onclick="location.href ='updateBoard.do?bId=${board.bId }&bTitle=${board.bTitle }&bContent=${board.bContent }'">수정</button> &nbsp;&nbsp;&nbsp; -->         
         <button type="submit">수정</button> &nbsp;&nbsp;&nbsp;
         <button type="reset">취소</button>
      </div>
      </form>
   </div><br/>
</div>
    </div>
    
    <div class="site-blocks-cover overlay inner-page-cover" style="background-image: url(images/hero_bg_1.jpg);" data-aos="fade" data-stellar-background-ratio="0.5">
      <div class="container">
        <div class="row align-items-center justify-content-center text-center">

          <div class="col-md-6" data-aos="fade-up" data-aos-delay="400">
            <h2>Subscribe</h2>
            <p class="mb-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit nihil saepe libero sit odio obcaecati veniam.</p>
            <form action="#" method="post" class="site-block-subscribe">
                <div class="input-group mb-3">
                  <input type="text" class="form-control border-secondary text-white bg-transparent" placeholder="Enter Email" aria-label="Enter Email" aria-describedby="button-addon2">
                  <div class="input-group-append">
                    <button class="btn btn-primary" type="button" id="button-addon2">Send</button>
                  </div>
                </div>
              </form>
          </div>
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