<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <header class="site-navbar py-4" role="banner">

      <div class="container">
        <div class="row align-items-center">


          <div class="col-3">
            <a href="home.do"><img src="images/yedam.png" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-9">
            <nav class="site-navigation position-relative text-right text-md-right" role="navigation">



              <div class="d-block d-lg-none ml-md-0 mr-auto"><a href="#" class="site-menu-toggle js-menu-toggle text-black"><span class="icon-menu h3"></span></a></div>

              <ul class="site-menu js-clone-nav d-lg-block">
                <li class="active">
                  <a href="home.do">Home</a>
                </li>
                <li><a href="boardList.do">Notice</a></li>
                <li><a href="contact.html">Contact</a></li>
                    <li class="has-children">
                  <a href="#">Dropdown</a>
                  <ul class="dropdown arrow-top">
                    <li><a href="#">Menu One</a></li>
                    <li><a href="#">Menu Two</a></li>
                    <li><a href="#">Menu Three</a></li>
                  </ul>
                </li>
                
                <c:if test="${empty name}">
                <li><a href="loginForm.do">Login / Register</a></li>
                </c:if>
                <c:if test="${author eq 'USER'}">
                <li><a href="myPage.do">MyPage</a></li>
                 <li><a href="logout.do">Logout</a></li>
                </c:if>
                 <c:if test="${author eq 'ADMIN' }">
      			<li><a href="#about">Members</a></li>
      			<li><a href="logout.do">Logout</a></li>
      			</c:if>
              </ul>
            </nav>


          </div>

        </div>
      </div>
      
    </header>

</body>
</html>