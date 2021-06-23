<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	List<String> names = new ArrayList<String>();
 	names.add("홍");
 	names.add("이");
 	names.add("박");
 	
 	pageContext.setAttribute("names",names);
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공유공간-콜렉션</title>
</head>
<body>
	name1 : <%= names.get(0) %><br>
	name2 : <%= names.get(1) %><br>
	name3 : <%= names.get(2) %><br>
	<hr>
	names : ${ names }<br>
	name1 : ${ names[0] }<br>
	name2 : ${ names[1] }<br>
	name3 : ${ names[2] }<br>
</body>
</html>