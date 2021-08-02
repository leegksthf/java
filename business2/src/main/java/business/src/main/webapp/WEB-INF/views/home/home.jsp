<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
  <title>Podcast &mdash; Colorlib Website Template</title>
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


    

    <div class="container pt-5 hero">
      <div class="row align-items-center text-center text-md-left">
        
        <div class="col-lg-4">
          <h1 class="mb-3 display-3">Tell Your Story to the World</h1>
          <p>Join with us! Login or Register. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Delectus, ex!</p>
        </div>
        <div class="col-lg-8">
          <img src="images/1x/asset-1.png" alt="Image" class="img-fluid">    
        </div>
      </div>
    </div>
    
<div id="mainContent" name="mainContent">
	<div class="clearBoth"></div>
<!--index-->
<table>
	<tbody><tr>
		<td id="loginForm">
			<div style="padding-left:80px;">
				
<script type="text/javascript" language="JavaScript">
// 엠파스 로긴 참고
var bReset = true;
function chkReset(f)
{
    if (bReset) { if ( f.mb_id.value == 'ID' ) f.mb_id.value = ''; bReset = false; }
    document.getElementById("pw1").style.display = "none";
    document.getElementById("pw2").style.display = "";
}
</script>

<!-- 로그인 전 외부로그인 시작 
<table border="0" cellspacing="0" cellpadding="0" style="width: 100%;">
  <tbody><tr style="width: 100%;">
    <td height="23" valign="top" style="font-weight: bold;">MEMBER LOGIN </td>
    <td height="23" valign="top" style="width: 50%;"><hr></td>
  </tr>
</tbody></table>
<table width="236" border="0" cellspacing="0" cellpadding="0">
<form name="fhead" method="post" action="javascript:fhead_submit(document.fhead);" autocomplete="off"></form>
<input type="hidden" name="url" value="%2Fgnu%2F">
  <tbody><tr>
    <td>
	<table border="0" cellspacing="0" cellpadding="0">
      <tbody><tr>
        <td><table border="0" cellpadding="0" cellspacing="0">
            <tbody><tr>
              <td height="22" valign="top"><div style="width: 54px; color: #999;">아이디</div></td>
              <td valign="top"><input class="outLogin b" name="mb_id" type="text" maxlength="20" required="required" itemname="아이디" onmouseover="chkReset(this.form);" onfocus="chkReset(this.form);" style="background-image: url(&quot;./js/wrest.gif&quot;); background-position: right top; background-repeat: no-repeat;"></td>
              <td valign="top">&nbsp;</td>
            </tr>
            <tr>
              <td><div style="width: 54px; color: #999;">비밀번호</div></td>
              <td id="pw1"><input name="textfield22" type="password" class="outLogin b"></td>
              <td id="pw2" style="display:none; padding:0px 0px 0px 0px;">
                <input class="outLogin b" name="mb_password" type="password" maxlength="20" onmouseover="chkReset(this.form);" onfocus="chkReset(this.form);"></td>
            </tr>
        </tbody></table></td>
        <td width="65" align="right" valign="bottom"><input name="image2" type="submit" value="LOGIN" onfocus="blur()" style="background: #A02; width: 54px; height: 45px; border: 0; color: white; border-radius: 5px;"></td>
      </tr>
    </tbody></table>
	<table width="10" height="8" border="0" align="center" cellpadding="0" cellspacing="0">
      <tbody><tr>
        <td></td>
      </tr>
    </tbody></table>
	<table border="0" cellspacing="0" cellpadding="0">
      <tbody><tr>
        <td width="8"></td>
        <td valign="top" class="outlogin_t -1 f11"><input type="checkbox" name="auto_login" value="1" onclick="if (this.checked) { if (confirm('자동로그인을 사용하시면 다음부터 회원아이디와 패스워드를 입력하실 필요가 없습니다.\n\n\공공장소에서는 개인정보가 유출될 수 있으니 사용을 자제하여 주십시오.\n\n자동로그인을 사용하시겠습니까?')) { this.checked = true; } else { this.checked = false; } }"></td>
        <td><table border="0" cellspacing="0" cellpadding="0">
          <tbody><tr>
		    <td width="45" height="16" align="center" valign="top" style="font-size: 8pt;">ID 저장 &nbsp;</td>
            <td width="1" bgcolor="#C6C6C6"></td>
            <td width="60" height="16" align="center" valign="top"><a href="./bbs/register.php" style="color: #777; font-size: 8pt;">회원가입</a></td>
			<td width="1" bgcolor="#C6C6C6"></td>
            <td width="125" height="16" align="center" valign="top"><a href="javascript:win_password_forget();" style="color: #777; font-size: 8pt;">아이디·비밀번호 찾기</a></td>
          </tr>
        </tbody></table></td>
      </tr>
    </tbody></table>
	<table width="10" height="8" border="0" align="center" cellpadding="0" cellspacing="0">
      <tbody><tr>
        <td></td>
      </tr>
    </tbody></table>
	</td>
  </tr>
 
</tbody></table>
<script language="JavaScript">
function fhead_submit(f)
{
    if (!f.mb_id.value)
    {
        alert("회원아이디를 입력하십시오.");
        f.mb_id.focus();
        return;
    }
    if (document.getElementById('pw2').style.display!='none' && !f.mb_password.value)
    {
        alert("패스워드를 입력하십시오.");
        f.mb_password.focus();
        return;
    }
    f.action = './bbs/login_check.php';    f.submit();
}
</script>
로그인 전 외부로그인 끝 -->			
</div>
		</td>
		<td class="indexTable">
	<style type="text/css">
	.article_list a {color:black;}
	.article_list a:visited {color:black;}
	.article_list h1 { color: black; font-size: 9pt; font-weight: normal; line-height: 12px; display: inline; } /* NORMAL ARTICLE */
	.article_list h2 { color: black; font-size: 9pt; font-weight: bold; line-height: 12px; display: inline; } /* NOTICE ARTICLE */
	.article_list h3 { color: black; font-size: 8pt; line-height: 12px; display: inline; } /* COMMENT */
</style>



<table cellpadding="0" cellspacing="0" width="100%" >
	<!-- 타이틀 시작 -->
	<tbody><tr>
			<td style="border-bottom: 2px solid #862633; padding: 5px; padding-left: 15px;">
			<a href="./bbs/board.php?bo_table=notice"><span style="font-weight: bold; color: #862633; font-size: 23px; font-family: 'Nanum Gothic', '나눔고딕';">공지사항</span></a>
		</td>
		<!--td style="padding: 5px; width: 5%;">
			<a href="./bbs/board.php?bo_table=notice">more..</a>
		</td-->
	</tr>
	<!-- 타이틀 끝 -->
	<!-- 게시물 시작 시작 -->
	<tr>
		<td colspan="2">
			<ul class="article_list" style="margin-top: 10px; margin-left: 10px; font-family: '나눔고딕'; padding-left: 0px;">
			<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=notice&amp;wr_id=3500">2021학년도 2학기 학부 휴학 및 복학 신청 안내</a></h1>&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=notice&amp;wr_id=3499">2021년도 2학기 경영대학 장학생 선발 안내(기간연장 ~8.31)</a></h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=notice&amp;wr_id=3498">2021년도 2학기 한국은행 생활장학금 공지 </a></h1>&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=notice&amp;wr_id=3497">경영대학 경력개발센터 상담 예약방법 안내</a></h1>&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=notice&amp;wr_id=3496">경영학과 교과과정 로드맵 안내</a></h1>&nbsp;<h3></h3></li>
	</ul>
		</td>
	</tr>
	
	<!-- 게시물 끝 -->
</tbody></table> 		</td>


		<td class="indexTable">
<style type="text/css">
	.article_list a {color:black;}
	.article_list a:visited {color:black;}
	.article_list h1 { color: black; font-size: 9pt; font-weight: normal; line-height: 12px; display: inline; } /* NORMAL ARTICLE */
	.article_list h2 { color: black; font-size: 9pt; font-weight: bold; line-height: 12px; display: inline; } /* NOTICE ARTICLE */
	.article_list h3 { color: black; font-size: 8pt; line-height: 12px; display: inline; } /* COMMENT */
</style>

<table cellpadding="0" cellspacing="0" width="100%">
	<!-- 타이틀 시작 -->
	<tbody><tr>
				<td style="border-bottom: 2px solid #862633; padding: 5px; padding-left: 15px;">
			<a href="./bbs/board.php?bo_table=activity"><span style="font-weight: bold; color: #862633; font-size: 23px; font-family: 'Nanum Gothic', '나눔고딕';">학생회 활동</span></a>
		</td>
		<!--td style="padding: 5px; width: 5%;">
			<a href="./bbs/board.php?bo_table=activity">more..</a>
		</td-->
	</tr>
	<!-- 타이틀 끝 -->
	<!-- 게시물 시작 시작 -->
	<tr>
		<td colspan="2">
			<ul class="article_list" style="margin-top: 10px; font-family: '나눔고딕'; padding-left: 25px;">
			<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=activity&amp;wr_id=216">2021년 제1차 경영대학 운영위원회 회의록</a></h1>&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=activity&amp;wr_id=215">제9차 비상대책위원회 집행부 회의록(210315)</a></h1>&nbsp;&nbsp;&nbsp;&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=activity&amp;wr_id=214">제8차 비상대책위원회 집행부 회의록(210308)</a></h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=activity&amp;wr_id=213">제7차 비상대책위원회 집행부 회의록(210215)</a></h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3></h3></li>
<li style="list-style:none; margin-bottom:5px; padding:0 0 0 10px; background:url(./skin/latest/cr_modify/img/list_icon.gif) no-repeat 0px 5px;"><h1><a href="./bbs/board.php?bo_table=activity&amp;wr_id=212">제6차 비상대책위원회 집행부 회의록(210201)</a></h1>&nbsp;<h3></h3></li>
						</ul>
		</td>
	</tr>
	<!-- 게시물 끝 -->
</tbody></table>		</td>
	</tr>
</tbody></table>
<!--/index-->

</div>
	


<!--   <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-lg-3">
            <div class="featured-user  mb-5 mb-lg-0">
              <h3 class="mb-4">Popular Podcaster</h3>
              <ul class="list-unstyled">
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_1.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Claire Stanford</span>
                      <span class="small">32,420 podcasts</span>
                    </div>
                  </a>
                </li>
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_2.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Dianne Winston</span>
                      <span class="small">12,381 podcasts</span>
                    </div>
                  </a>
                </li>
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_3.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Borris Larry</span>
                      <span class="small">9,291 podcasts</span>
                    </div>
                  </a>
                </li>
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_4.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Garry Smith</span>
                      <span class="small">3,291 podcasts</span>
                    </div>
                  </a>
                </li>
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_5.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Gerson Stack</span>
                      <span class="small">1,092 podcasts</span>
                    </div>
                  </a>
                </li>
                <li>
                  <a href="#" class="d-flex align-items-center">
                    <img src="images/person_6.jpg" alt="Image" class="img-fluid mr-2">
                    <div class="podcaster">
                      <span class="d-block">Jenna Stone</span>
                      <span class="small">911 podcasts</span>
                    </div>
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-lg-9">
            <div class="d-block d-md-flex podcast-entry bg-white mb-5" data-aos="fade-up">
              <div class="image" style="background-image: url('images/img_1.jpg');"></div>
              <div class="text">
                <h3 class="font-weight-light"><a href="single-post.html">Episode 08: How To Create Web Page Using Bootstrap 4</a></h3>
                <div class="text-white mb-3"><span class="text-black-opacity-05"><small>By Mike Smith <span class="sep">/</span> 16 September 2017 <span class="sep">/</span> 1:30:20</small></span></div>
                <div class="player">
                  <audio id="player2" preload="none" controls style="max-width: 100%">
                    <source src="http://www.largesound.com/ashborytour/sound/AshboryBYU.mp3" type="audio/mp3">
                    </audio>
                  </div>
                </div>
              </div>
              <div class="d-block d-md-flex podcast-entry bg-white mb-5" data-aos="fade-up">
                <div class="image" style="background-image: url('images/img_2.jpg');"></div>
                <div class="text">
                  <h3 class="font-weight-light"><a href="single-post.html">Episode 07: How To Create Web Page Using Bootstrap 4</a></h3>
                  <div class="text-white mb-3"><span class="text-black-opacity-05"><small>By Mike Smith <span class="sep">/</span> 16 September 2017 <span class="sep">/</span> 1:30:20</small></span></div>
                  <div class="player">
                    <audio id="player2" preload="none" controls style="max-width: 100%">
                      <source src="http://www.largesound.com/ashborytour/sound/AshboryBYU.mp3" type="audio/mp3">
                      </audio>
                    </div>
                  </div>
                </div>
                <div class="d-block d-md-flex podcast-entry bg-white mb-5" data-aos="fade-up">
                  <div class="image" style="background-image: url('images/img_3.jpg');"></div>
                  <div class="text">
                    <h3 class="font-weight-light"><a href="single-post.html">Episode 06: How To Create Web Page Using Bootstrap 4</a></h3>
                    <div class="text-white mb-3"><span class="text-black-opacity-05"><small>By Mike Smith <span class="sep">/</span> 16 September 2017 <span class="sep">/</span> 1:30:20</small></span></div>
                    <div class="player">
                      <audio id="player2" preload="none" controls style="max-width: 100%">
                        <source src="http://www.largesound.com/ashborytour/sound/AshboryBYU.mp3" type="audio/mp3">
                        </audio>
                      </div>
                    </div>
                  </div>
                  <div class="d-block d-md-flex podcast-entry bg-white mb-5" data-aos="fade-up">
                    <div class="image" style="background-image: url('images/img_4.jpg');"></div>
                    <div class="text">
                      <h3 class="font-weight-light"><a href="single-post.html">Episode 05: How To Create Web Page Using Bootstrap 4</a></h3>
                      <div class="text-white mb-3"><span class="text-black-opacity-05"><small>By Mike Smith <span class="sep">/</span> 16 September 2017 <span class="sep">/</span> 1:30:20</small></span></div>
                      <div class="player">
                        <audio id="player2" preload="none" controls style="max-width: 100%">
                          <source src="http://www.largesound.com/ashborytour/sound/AshboryBYU.mp3" type="audio/mp3">
                          </audio>
                        </div>
                      </div>
                    </div>
                    <div class="d-block d-md-flex podcast-entry bg-white mb-5" data-aos="fade-up">
                      <div class="image" style="background-image: url('images/img_5.jpg');"></div>
                      <div class="text">
                        <h3 class="font-weight-light"><a href="single-post.html">Episode 04: How To Create Web Page Using Bootstrap 4</a></h3>
                        <div class="text-white mb-3"><span class="text-black-opacity-05"><small>By Mike Smith <span class="sep">/</span> 16 September 2017 <span class="sep">/</span> 1:30:20</small></span></div>
                        <div class="player">
                          <audio id="player2" preload="none" controls style="max-width: 100%">
                            <source src="http://www.largesound.com/ashborytour/sound/AshboryBYU.mp3" type="audio/mp3">
                            </audio>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="container" data-aos="fade-up">
                      <div class="row">
                        <div class="col-md-12 text-center">
                          <div class="site-block-27">
                            <ul>
                              <li><a href="#" class="icon-keyboard_arrow_left"></a></li>
                              <li class="active"><span>1</span></li>
                              <li><a href="#">2</a></li>
                              <li><a href="#">3</a></li>
                              <li><a href="#">4</a></li>
                              <li><a href="#">5</a></li>
                              <li><a href="#" class="icon-keyboard_arrow_right"></a></li>
                            </ul>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
 --> 
    <!-- <div class="site-section">
      <div class="container" data-aos="fade-up">
        <div class="row mb-5">
          <div class="col-md-12 text-center">
            <h2 class="font-weight-bold text-black">Behind The Mic</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_1.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Megan Smith</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_2.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Brooke Cagle</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_3.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Philip Martin</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_4.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Steven Ericson</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_5.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Nathan Dumlao</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-5">
            <div class="team-member">
              <img src="images/person_6.jpg" alt="Image" class="img-fluid">
              <div class="text">
                <h2 class="mb-2 font-weight-light h4">Brooke Cagle</h2>
                <span class="d-block mb-2 text-white-opacity-05">Creative Director</span>
                <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit ullam reprehenderit nemo.</p>
                <p>
                  <a href="#" class="text-white p-2"><span class="icon-facebook"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="text-white p-2"><span class="icon-linkedin"></span></a>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div> -->

 <!--    <div class="site-section bg-light block-13">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md-12 text-center">
            <h2 class="font-weight-bold text-black">Featured Guests</h2>
          </div>
        </div>
        <div class="nonloop-block-13 owl-carousel">
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_1.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Megan Smith</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_2.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Brooke Cagle</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_3.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Philip Martin</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_4.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Steven Ericson</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_5.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Nathan Dumlao</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
          <div class="text-center p-3 p-md-5 bg-white">
            <div class="mb-4">            
              <img src="images/person_6.jpg" alt="Image" class="w-50 mx-auto img-fluid rounded-circle">
            </div>
            <div class="">
              <h3 class="font-weight-light h5">Brook Smith</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, iusto. Aliquam illo, cum sed ea? Ducimus quos, ea?</p>
            </div>
          </div>
        </div>
      </div>
    </div>
     -->
<!--     <div class="site-blocks-cover overlay inner-page-cover" style="background-image: url(images/hero_bg_1.jpg);" data-aos="fade" data-stellar-background-ratio="0.5">
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
 -->

   
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