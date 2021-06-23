<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core태그</title>
</head>
<body>

	<%-- 
		c:set태그 - 값설정
	 --%>
	1값을 가지는 변수 cnt를 공유영역(page)에 등록<br>
	<c:set var="cnt" value="1"/>
	공유영역에 등록된 변수 cnt출력<br>
	cnt : ${ cnt }
	<hr>
	cnt변수에 1 더하고, cnt값 출력<br>
	<c:set var="cnt" value="${ cnt + 1 }" scope="request"/>
	<%-- request에 선언된 변수이므로 cnt+1값이 나오지 않음 --%>
	cnt : ${ cnt }<br>
	request cnt : ${ requestScope.cnt }<br>
	<hr>
	
	
	<%-- 
		c:remove태그 - 삭제
		scope설정 안해주면 다지워버림!
	 --%>
	 request공유영역에 등록된 cnt변수 삭제<br>
	 <c:remove var="cnt" scope="request"/>
	 
	 cnt삭제 후<br>
	 page cnt : ${ cnt }<br>
	 request cnt : ${ requestScope.cnt }<br>
	 <hr>
	 
	 
	 <%--
	 	c:out태그 - 출력
	 	default ="": 
	 	excapeXml = "true/false" : html태그 해석여부
	 		- true : 단순 문자열로 해석
	 		- false : html태그 해석
	 	
	 --%>
	 <%-- <c:set var="msg" value="hello"/> --%>
	 value 속성만 지정 : <c:out value="hello world"/><br>
	 msg변수 미설정 : <c:out value="${ msg }" default="msg값 없어용"/><br>
	 <hr>
	 value속성에 태그가 들어있는 경우(escapeXml = true)<br>
	 <c:out value="<h1>Hello</h2>" escapeXml="true"/><br>
	 <hr>
	 value 속성에 태그가 들어있는 경우(escapeXml = false)<br>
	 <c:out value="<h1>Hello</h2>" escapeXml="false"/><br>
	 
	 
	 
	
	
</body>
</html>