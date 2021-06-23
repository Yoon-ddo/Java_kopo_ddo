
<%@page import="kr.ac.kopo.board.BoardVO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1.
	List<Map> boardList = new ArrayList<>();
	Map<String,String> boardMap = new HashMap<>();
	boardMap.put("title","맵타이틀");
	boardList.add(boardMap);
	pageContext.setAttribute("boardList", boardList);
	
	//2.
	List<BoardVO> boardList2 = new ArrayList<>();
	BoardVO boardVO = new BoardVO();
	boardVO.setTitle("타이틀");
	boardList2.add(boardVO);
	pageContext.setAttribute("boardList2",boardList2);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	boardList[0].title : ${ boardList[0].title }<br>
	성공 / 실패 ? ${ not empty boardList[0].title? "성공" : "실패" }<br>
	<hr>
	boardList2[0].title : ${ boardList2[0].title }<br>
	성공 / 실패 ? ${ not empty boardList2[0].title ? "성공" : "실패" }<br>
</body>
</html>