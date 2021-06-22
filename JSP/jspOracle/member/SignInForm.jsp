<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script>
	
	function checkPwd(){
		if($("#password")){
			if($("#password").val()==$("#passwordck").val()){
				alert("비밀번호가 일치합니다!")
				return true
			
			}else{
				alert("비밀번호가 일치하지 않습니다!")
				return false
			}			
		}else{
			alert("비밀번호를 다시 입력하세요!")
			return false
		}
	}
	
	function whenSubmit(){
		
		boolean pwdck = false
		
		return false
		
	}
	
	$(document).ready(function(){
		
		
	})

</script>
</head>
<body>
	<div align="center">
		<hr width="80%">
		<h2>회원가입</h2>
		<hr width="80%">
		<br>
		<form action="signWelcome.jsp" method="post" onsubmit="return whenSubmit()">
			<table width="80%" border="1">
				<tr>
					<th width="20%">이름</th>
					<td><input type="text" size="70" name="name" id="name">
				</tr>
				<tr>
					<th width="20%">ID</th>
					<td><input type="text" size="60" name="id" id="id">
					<button id="중복체크">중복체크</button></td>
				</tr>
				<tr>
					<th width="20%">비밀번호</th>
					<td><input type="password" size="70" name="password" id="password"></td>
					
				</tr>
				<tr>
					<th width="20%">비밀번호확인</th>
					<td><input type="password" size="50" name="passwordck" id="passwordck">
					<button id="비밀번호체크" onclick="checkPwd()">비밀번호체크</button></td>
				</tr>
				<tr>
					<th width="20%">이메일</th>
					<td><input type="text" size="15" name="eid" id="eid"> @ 
						<select name="emailbox" id="emailbox" width="80px">
							<option value="naver.com">naver.com</option>
							<option value="nate.com">nate.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="daum.net">daum.net</option>
							<option value="hanmail.net">hanmail.net</option>
							<option value="kopomail.com">student.kopo.ac.kr</option>
						</select>
					</td>
				</tr>
				<tr>
					<th width="20%">전화번호</th>
					<td><select name="tel1" id="tel1" width="30px">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="017">017</option>
						<option value="019">019</option>
					</select> - <input type="text" name="tel2" id="tel2" size="4"> - 
					<input type="text" name="tel3" id="tel3" size="4">
					</td>
				</tr>
				<tr>
					<th width="20%">주소</th>
					<td>
					우편번호 : <input type="text" name="fpost" id="fpost" size="5"> - <input type="text" name="lpost" id="lpost" size="5">
					<br>
					<select name="addrloc" id="addrloc" width="50px">
						<option value="서울">서울</option>
						<option value="충북">충북</option>
						<option value="충남">충남</option>
						<option value="전북">전북</option>
						<option value="전남">전남</option>
						<option value="경기">경기</option>
						<option value="경북">경북</option>
						<option value="경남">경남</option>
						<option value="제주">제주</option>
					</select> 
					<input type="text" name="basicaddr" id="basicaddr" size="15"> 
					상세주소 : <input type="text" name="detailaddr" id="detailaddr" size="20">
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="가입하기" id="submitBtn">
		</form>
	</div>

</body>
</html>