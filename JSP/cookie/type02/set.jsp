<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
 <%
 	request.setCharacterEncoding("utf-8");
 	String cName = request.getParameter("cName");
 	String cValue = request.getParameter("cValue");
 	
 	// encoding ( 쿠키값이 한글일 때 그냥 넣을 수 없음! )
 	cName = URLEncoder.encode(cName,"utf-8");
 	cValue = URLEncoder.encode(cValue,"utf-8");
 	
 	//쿠키생성
 	Cookie cookie = new Cookie(cName, cValue);
 	
 	//쿠키전송
 	response.addCookie(cookie);
 	
 	
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>쿠키설정 완료</h2>
	<a href="get.jsp">설정된 쿠키조회</a>
	
</body>
</html>