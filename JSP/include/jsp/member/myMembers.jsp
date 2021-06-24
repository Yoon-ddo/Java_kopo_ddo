<%@ page import="jdbcUtil.JDBCClose"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="jdbcUtil.ConnectionFactory"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("utf-8");
 	Connection conn = new ConnectionFactory().getConnection();
 	StringBuilder sql = new StringBuilder();
 	sql.append(" select id, name, tel1||'-'||tel2||'-'||tel3 as tel, email_id||email_domain as email, to_char(reg_date,'YYYY-MM-DD')as reg_date ");
 	sql.append(" from t_member ");
 	
 	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
 	ResultSet rs = pstmt.executeQuery();
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원조회프로그램</title>
</head>
<body>
	<div align="center">
		<hr width="80%">
		<h2>회원조회프로그램에 오신 것을 환영합니다!</h2>
		<hr width="80%">
		<br>
		<form >
			<select id="searchbox" width="40px">
				<option selected>검색</option>
				<option value="id">아이디</option>
				<option value="name">이름</option>
				<option value="tel">전화번호</option>
			</select>
				<input type="text" size="60">
				<input type="submit" value="검색">
		</form>
		<br>
		<table border="1" width="80%">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>가입일</th>
			</tr>
			<% 
				while(rs.next()){
					String id= rs.getString("id");
					String name  = rs.getString("name");
					String tel = rs.getString("tel");
					String email = rs.getString("email");
					String enrolldt = rs.getString("reg_date");
				
			%>
				<tr>
					<td><a href="detailMember.jsp?id=<%= id %>"><%= id %></a></td>
					<td><%= name %></td>
					<td><%= tel %></td>
					<td><%= email %></td>
					<td><%= enrolldt %></td>
				</tr>
			<%
				}			
			%>
			
		</table>	
		</form>
	</div>
</body>
</html>


<%
	JDBCClose.close(conn,pstmt);
%>