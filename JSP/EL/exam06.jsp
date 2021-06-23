<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String[] names = {"홍","강","김","이"};
	pageContext.setAttribute("names",names);
	
	
%>

<html>
<head>
<meta charset="UTF-8">
<title>공유영역-배열</title>
</head>
<body>
	첫번째 이름 : <%= names[0] %><br>
	두번째 이름 : <%= names[1] %><br>
	세번째 이름 : <%= names[2] %><br>
	네번째 이름 : <%= names[3] %><br>
	
	<hr>
	첫번째 이름 : ${ names[0] }<br>
	두번째 이름 : ${ names[1] }<br>
	세번째 이름 : ${ names[2] }<br>
	네번째 이름 : ${ names[3] }<br>
	다섯번째이름: ${ names[4] }
	
</body>
</html>