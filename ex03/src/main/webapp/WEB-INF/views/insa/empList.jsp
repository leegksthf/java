<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h>사원목록</h>
<div>
<a href="insertEmp">등록</a>
</div>
<c:forEach items="${empList }" var="emp">
	<a href="updateEmp?employee_id=${emp.employee_id }">${emp.employee_id }</a>
	${emp.firstName } = {$emp.last_name}
	${emp.email } <br>
</c:forEach>