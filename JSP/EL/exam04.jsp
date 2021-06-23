<%@page import="kr.ac.kopo.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO board = new BoardVO();
	board.setNo(1);
	board.setTitle("test");
	
	//pageContext영역 등록 : boardVO값 : 생성된 BoardVO객체
	pageContext.setAttribute("boardVO", board);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공유영역-VO</title>
</head>
<body>
	no : <%= board.getNo() %><br>
	title : <%= board.getTitle() %><br>
	
	<hr>
	no : <%= ((BoardVO)pageContext.getAttribute("boardVO")).getNo() %><br>
	title : <%= ((BoardVO)pageContext.getAttribute("boardVO")).getTitle() %><br>
	<hr>
	
	el no : ${ boardVO.no }<br>
	el title : ${ boardVO.title }<br>
	<%-- 콜렉션 --%>
</body>
</html>