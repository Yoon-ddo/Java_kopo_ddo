<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL연산자</title>
</head>
<body>

	<h3>산술</h3>
	5 + 5 : <%= 5+5 %><br>
	5 + 5 : ${ 5+5 }<br>
	9 % 5 : ${ 9%5 }<br>
	9 mod 5 : ${ 9 mod 5 }<br>
	<h3>비교</h3>
	9 > 5 : ${ 9 > 5 }<br>
	9 gt 5 : ${ 9 gt 5 }<br>
	9 == 5 : ${ 9 == 5 }<br>
	9 eq 5 : ${ 9 eq 5 }<br>
	9 != 5 : ${ 9 != 5 }<br>
	<!-- 9 ne 5 : ${ 9 ne 5 }<br> -->
	<h3>조건</h3>
	(5 == 5) && (9 > 6) : ${(5 == 5) && (9 > 6) }<br>
	(5 eq 5) and (9 gt 6) : ${(5 eq 5) && (9 gt 6) }<br>
	<h3>empty</h3>
	empty str: ${ empty str }<br>
	not empty str : ${ not empty str }<br>
	<h3>삼항</h3>
	5의 짝수 홀수 판단 : ${ 5 % 2 == 0 ? "짝수" : "홀수" }<br>
	5의 짝수 홀수 판단 : ${ 5 mod 2 eq 0 ? "짝수" : "홀수" }<br>
	
	
	
	
</body>
</html>