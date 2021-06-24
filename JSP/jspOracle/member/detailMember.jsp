<%@page import="kr.ac.kopo.member.vo.memberVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcUtil.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String getId = request.getParameter("id");
	
	Connection conn = new ConnectionFactory().getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append(" select id, name, password, email_id||email_domain as email, ");
	sql.append(" tel1||'-'||tel2||'-'||tel3 as tel, post, basic_addr||' '||detail_addr as addr, ");
	sql.append(" type, to_char(reg_date,'YYYY-MM-DD')as reg_date ");
	sql.append(" from t_member ");
	sql.append(" where id like ? ");
	
	
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	pstmt.setString(1,getId);
	
	ResultSet rs = pstmt.executeQuery();
	
	rs.next();
	
	String id = rs.getString("id");
	String name = rs.getString("name");
	String password = rs.getString("password");
	String email = rs.getString("email");
	String tel = rs.getString("tel");
	String zip = rs.getString("post");
	String addr = rs.getString("addr");
	String type = rs.getString("type");
	String regDate= rs.getString("reg_date");
	
	memberVO member = new memberVO(id, name, password, email, tel, zip, addr, type, regDate);
	pageContext.setAttribute("member", member);
	
	
	
	
	
%>
<title>회원상세</title>

<script type="text/javascript" src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		
		$('#backBtn').click(function(){
			location.href="myMembers.jsp"	
		})
		
	})
	
</script>
</head>
<body>
	<div align="center">
		<hr width="80%">
		<h2>회원정보</h2>
		<hr width="80%">
		<br>
		<table border="1" style="width: 80%">
			<tr>
				<th width="20%">ID</th>
				<td>${ member.id }</td>
			</tr>
			<tr>
				<th width="20%">이름</th>
				<td>${ member.name }</td>
			</tr>
			<tr>
				<th width="20%">비밀번호</th>
				<td>${ member.password }</td>
			</tr>
			<tr>
				<th width="20%">이메일</th>
				<td>${ member.email }</td>
			</tr>
			<tr>
				<th width="20%">전화번호</th>
				<td>${ member.tel }</td>
			</tr>
			<tr>
				<th width="20%">우편번호</th>
				<td>${ member.zip }</td>
			</tr>
			<tr>
				<th width="20%">주소</th>
				<td>${ member.addr }</td>
			</tr>
			<tr>
				<th width="20%">사용자유형</th>
				<td>${ member.type }</td>
			</tr>
			<tr>
				<th width="20%">가입일</th>
				<td>${ member.regDate }</td>
			</tr>
		</table>
		<br>
		<button id="backBtn">되돌아가기</button>
		
	</div>
</body>
</html>
