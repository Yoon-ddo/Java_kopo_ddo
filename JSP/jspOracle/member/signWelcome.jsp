<%@page import="jdbcUtil.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcUtil.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	request.setCharacterEncoding("utf-8");
 	String name = request.getParameter("name");
 	String id = request.getParameter("id");
 	String pwd = request.getParameter("password");
 	String eid = request.getParameter("eid");
 	String email = "@"+request.getParameter("emailbox");
 	String tel1 = request.getParameter("tel1");
 	String tel2 = request.getParameter("tel2");
 	String tel3 = request.getParameter("tel3");
 	String post = request.getParameter("fpost")+"-"+request.getParameter("lpost");
 	String basicAddr = request.getParameter("addrloc") + " " + request.getParameter("basicaddr");
 	String detailAddr = request.getParameter("detailaddr");
 	
 	Connection conn = new ConnectionFactory().getConnection();
 	StringBuilder sql = new StringBuilder();
 	sql.append("insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3, ");
 	sql.append(" post, basic_addr, detail_addr) ");
 	sql.append("values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
 	
 	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
 	
 	pstmt.setString(1, id);
 	pstmt.setString(2, name);
 	pstmt.setString(3, pwd);
 	pstmt.setString(4, eid);
 	pstmt.setString(5, email);
 	pstmt.setString(6, tel1);
 	pstmt.setString(7, tel2);
 	pstmt.setString(8, tel3);
 	pstmt.setString(9, post);
 	pstmt.setString(10, basicAddr);
 	pstmt.setString(11, detailAddr);
 	
 	pstmt.executeUpdate();
 	JDBCClose.close(conn, pstmt);
 %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 성공</title>
<script>
	alert("회원가입에 성공하였습니다!");
</script>
</head>
<body>

	<div align="center">
		<hr width="80%">
		<h2>환영합니다!</h2>
		<hr width="80%">
		<br>
		<button>메인으로</button>  <button>로그인하러가기</button>
	</div>

</body>
</html>