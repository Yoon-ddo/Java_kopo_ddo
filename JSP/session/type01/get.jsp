<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// object형이므로 string으로 변환
	String id=(String)session.getAttribute("id");
	String password=(String)session.getAttribute("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	설정된 세션ID : <%= id %><br>
	설정된 세션PW : <%= password %><br>
	<hr>
	설정된 세션ID : ${ sessionScope.id }<br>
	설정된 세션PW : ${ sessionScope.password }<br>
	<br>
	<a href="remove.jsp">설정된 세션삭제</a>
</body>
</html>