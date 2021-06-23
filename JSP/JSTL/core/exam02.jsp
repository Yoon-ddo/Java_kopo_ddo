<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core:if, choose</title>
</head>
<body>

		 
	 <%--
	 	c:if : if태그
	 	test="조건"이 참일 경우에만 실행! (else는 없음)
	 	
	 	
	 	type이 S인 경우 관리자님 환영합니다가 나오게 하고싶다면?
	  --%>
	  
	  <c:if test="${ param.type == 'S' }">
	  <h2>관리자님 환영합니다.</h2>
	  </c:if>
	  
	  <c:if test="${ param.type == 'U' }">
	  <h2>회원님 환영합니다.</h2>
	  </c:if>
	  
	  <%--
	  	c:choose태그
	  	
	   --%>
	   
	   <c:choose>
	   	<c:when test="${ empty param.type }">
	   		<h3>파라미터가 잘못되었습니다.</h3>	
	   	</c:when>
	   	<c:when test="${ param.type == 'U' }">
	   		<h3>회원님 환영합니다!</h3>
	   	</c:when>
	   	<c:otherwise>
	   		<h3>관리자님 환영합니다.</h3>
	   	</c:otherwise>
	   
	   </c:choose>
	   	
	   
	   
	   
	   
</body>
</html>