<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration<String> hNs = request.getHeaderNames();
		while(hNs.hasMoreElements()){
			String hN = hNs.nextElement();
			String hV = request.getHeader(hN);
	%>
	
			<%=hN %> : <%= hV %><br>
	<%
		}
	%>
</body>
</html>