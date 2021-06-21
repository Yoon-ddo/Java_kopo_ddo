<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 사용하기</title>
</head>
<body>
	<h2> 1~10 사이의 정수 출력</h2>
	<%
		for(int i=1; i<=10; i++){
			out.write(i + "<br>");
		}
	%>
</body>
</html>