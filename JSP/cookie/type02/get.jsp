<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();

	StringBuilder sb = new StringBuilder();
	for(Cookie c : cookies) {
		String cName  = c.getName();
		String cValue = c.getValue();
		
		// decoding
		cName = URLDecoder.decode(cName, "utf-8");
		cValue = URLDecoder.decode(cValue, "utf-8");
		
		sb.append("쿠키이름 : " + cName + ", ");
		sb.append("쿠키값 : " + cValue + "<br>");
		
		// request영역에 올리기도 가능
		//pageContext.setAttribute("cookieData", sb.toString());
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>설정된 쿠키정보</h2>
	<%= sb.toString() %>
	<%-- ${ cookieData } --%>
	
	<a href="makeForm.jsp">쿠키설정 이동</a>
</body>
</html>









