<%@page import="jdbcUtil.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcUtil.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	request.setCharacterEncoding("utf-8");
 	String title = request.getParameter("title");
 	String writer = request.getParameter("writer");
 	String content = request.getParameter("content");
 	
 	Connection conn = new ConnectionFactory().getConnection();
 	StringBuilder sql = new StringBuilder();
 	sql.append("insert into t_board(no, title, writer, content) ");
 	sql.append(" values(seq_t_board_no.nextval, ?, ?, ?) ");
 	
 	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
 	pstmt.setString(1, title);
 	pstmt.setString(2, writer);
 	pstmt.setString(3, content);
 	
 	pstmt.executeUpdate();
 	JDBCClose.close(conn, pstmt);
 	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	alert("새글등록이 완료되었습니다.")
	location.href="list.jsp"
</script>
</head>
<body>

</body>
</html>