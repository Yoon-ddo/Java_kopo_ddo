<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공유영역1</title>
</head>
<body>
	<%--
		객체 등록 : 공유영역명.setAttribute(이름,값)
		객체 조회 :		.getAttribute(이름) 
		객체 삭제 :		.removeAttribute(이름)
		공유영역 4가지 : pageContext, request, session, application
	 --%>

	empty msg : ${ empty msg }<br>
	<hr>
	<%
		//pageContext영역에 객체 등록
		pageContext.setAttribute("msg","pageContext영역에 등록");
		String message = (String)pageContext.getAttribute("msg");
	%>
	empty msg : ${ empty msg }<br>
	message : <%= message %><br>
	message : <%= pageContext.getAttribute("msg") %><br>
	msg : ${ pageScope.msg }<br>
	msg : ${ msg }<br>
	<hr>
	<%--
		el의 공유영역 4가지 : pageScope, requestScope, sessionScope, applicationScope
	 --%>
	<%
		//request영역에 객체등록
		request.setAttribute("msg", "request영역에 등록");
		request.setAttribute("id", "hong");
	%>
	
	msg : ${ msg }<br>
	requestScope의 msg : ${ requestScope.msg }<br>
	id : ${ id }<br>
	
	
	
</body>
</html>