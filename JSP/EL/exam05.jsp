<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Map<String,String> board = new HashMap<String, String>();
	board.put("no","1");
	board.put("title", "test");
	
	pageContext.setAttribute("boardVO",board);
%>
<html>
<head>
<meta charset="UTF-8">
<title>공유영역-Map</title>
</head>
<body>
	no : <%= board.get("no") %><br>
	title : <%= board.get("title") %><br>
	<hr>
	el no : ${ boardVO.no }<br>	
	el title : ${ boardVO.title }<br>
	<%-- 콜렉션 --%>
	el title : ${ boardVO['title'] }
	<hr>
	el aaa : ${ boardVO.aaa }<br>


</body>
</html>