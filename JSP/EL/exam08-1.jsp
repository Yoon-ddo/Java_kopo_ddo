<%@page import="kr.ac.kopo.board.BoardVO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%
	//1. 자바빈즈클래스 + 콜렉션 **제일 많이 쓰임
	BoardVO board = new BoardVO();
	board.setTitle("성공");
	List<BoardVO> boardList = new ArrayList<BoardVO>();
	boardList.add(board);
	pageContext.setAttribute("boardList", boardList);
	
	
	//2. 자바빈즈클래스  + 배열
	BoardVO board2 = new BoardVO();
	board2.setTitle("성공");
	BoardVO[] boardList2 = new BoardVO[]{board2};
	pageContext.setAttribute("boardList2", boardList2);
	
	//3. 맵객체 + 배열
	Map<String, String> board3 = new HashMap<>();
	board3.put("title","성공");
	Map[] boardList3 = new Map[]{board3};
	pageContext.setAttribute("boardList3", boardList3);
	
	//4. 맵객체 + 리스트
	Map<String, String> board4 = new HashMap<>();
	board4.put("title","성공");
	List<Map> boardList4 = new ArrayList<>();
	boardList4.add(board4);
	pageContext.setAttribute("boardList4",boardList4);
	
	
	
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	1. 자바빈즈클래스 + 콜렉션 : ${ boardList[0].title }<br>
	2. 자바빈즈클래스  + 배열 : ${ boardList2[0].title }<br>
	3. 맵객체 + 배열 : ${ boardList3[0].title }<br>
	4. 맵객체 + 리스트 : ${ boardList4[0].title }<br>

</body>
</html>