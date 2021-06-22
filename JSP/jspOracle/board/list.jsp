<%@page import="jdbcUtil.JDBCClose"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcUtil.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = new ConnectionFactory().getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append(" select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
	sql.append(" from t_board ");
	sql.append(" order by no desc");
	
	conn.prepareStatement(sql.toString());
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	ResultSet rs = pstmt.executeQuery();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
<script src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		
		$('#addBtn').click(function(){
			location.href = "writeForm.jsp"
		})
		
		
	})
</script>
</head>
<body>
	<div align="center">
	
		<hr width="80%">	
		<h2>게시판 목록</h2>
		<hr width="80%">
		
		<br>
		<table border="1" style="width:80%">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="16%">작성자</th>
				<th width="20%">등록일</th>
			</tr>
			
			<%
				while(rs.next()){
					int no = rs.getInt("no");
					String tit = rs.getString("title");
			%>	
				<tr>
					<td><%= no %></td>
					<td><a href="detail.jsp?no=<%= no %>"><%= tit %></a></td>
					<td><%= rs.getString("writer") %></td>
					<td><%= rs.getString("reg_date") %></td>
				</tr>
			<%
				}
			%>	
			
		</table>
		<br>
		<button id="addBtn">새글등록</button>	
	</div>
	
</body>
</html>


<%
	JDBCClose.close(conn,pstmt);
%>