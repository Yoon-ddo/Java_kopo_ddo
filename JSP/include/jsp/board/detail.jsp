<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@page import="jdbcUtil.JDBCClose"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcUtil.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	//1. 게시물번호 추출
	int boardNo = Integer.parseInt(request.getParameter("no"));
	
	//2. 데이터베이스에서 조회
	Connection conn = new ConnectionFactory().getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append(" select no, title, writer, content, view_cnt, to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
	sql.append(" from t_board ");
	sql.append(" where no = ? ");
	
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	pstmt.setInt(1,boardNo);
	
	ResultSet rs = pstmt.executeQuery();
	
	rs.next();
	
	int no = rs.getInt("no");
	String title = rs.getString("title");
	String writer = rs.getString("writer");
	String content = rs.getString("content");
	int viewCnt = rs.getInt("view_cnt");
	String regDate = rs.getString("reg_date");
	
	BoardVO board = new BoardVO(no, title, writer, content, viewCnt, regDate);
	pageContext.setAttribute("board", board);
	
	/*
	pageContext.setAttribute("no", no);
	pageContext.setAttribute("title", title);
	pageContext.setAttribute("writer", writer);
	pageContext.setAttribute("content", content);
	pageContext.setAttribute("view_cnt", viewCnt);
	pageContext.setAttribute("reg_date", regDate);
	*/
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세</title>
<link rel="stylesheet" href="/Mission-Web/resources/css/layout.css"/>
<link rel="stylesheet" href="/Mission-Web/resources/css/board.css"/>






<script type="text/javascript" src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script>

	$(document).click(function(){
		
		$('#backBtn').click(function(){
			location.href="list.jsp"
		})
		
	})
</script>
</head>
<body>

	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>
	<section>
		<div>
		<hr width="80%">
		<h2>게시판 상세</h2>
		<hr>
		<br>
		<table border="1" style="width: 100%">
			<tr>
				<th width="25%">번호</th>
				<td><c:out value="${ board.no }"/></td>
			</tr>
			<tr>
				<th width="25%">제목</th>
				<td><c:out value="${ board.title }"/></td>
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td><c:out value="${ board.writer }"/></td>
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td><c:out value="${ board.content }"/></td>
			</tr>
			<tr>
				<th width="25%">조회수</th>
				<td><c:out value="${ board.viewCnt }"/></td>
			</tr>
			<tr>
				<th width="25%">등록일</th>
				<td><c:out value="${ board.regDate }"/></td>
			</tr>
		</table>
		<br>
		<button id="backBtn">되돌아가기</button>
	
	</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/bottom.jsp" %>
	</footer>

</body>
</html>


<%
	JDBCClose.close(conn,pstmt);
%>