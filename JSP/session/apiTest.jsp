<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = session.getId();
	int interval = session.getMaxInactiveInterval();
	
	//유효시간 변경(2초)
	session.setMaxInactiveInterval(2);
	int interval2 = session.getMaxInactiveInterval();
	
	//마지막으로 접근한 시간
	long time = session.getLastAccessedTime();
	String pattern= "yyyy년 MM월 dd일 hh시mm분ss초";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>기존 유효시간 : <%= interval %>초</h2>
	<h2>변경된 유효시간 : <%= interval2 %>초</h2>
	<h2>세션 id(JSESSIONID) : <%= id %></h2>
	<h2>마지막으로 로그인한 시간 : <%= sdf.format(time) %></h2>
</body>
</html>