<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>

	function whenSubmit(){
		
		return false
		
	}
	
	// 주소검색 API
	function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zip').value = data.zonecode;
                document.getElementById('addr1').value = data.address;
              	document.getElementById('addr2').value=data.buildingName;
            }
        }).open();
    }

	
	$(document).ready(function(){
		

		$('#alert-danger').hide();
		$('#passwordck').keyup(function(){
			var pwd = $('#password').val()
			var ckpwd = $('#passwordck').val()
			if(pwd == ckpwd){
	            $('#alert-danger').hide();
	            $('#submitBtn').attr("disabled",false);
			}else{
	            $('#alert-danger').show();
	            $('#submitBtn').attr("disabled",true);
	         }
		})
		
		$('#name-alert-danger').hide();
		$('#name').keyup(function(){
			var name = $(this).val()
			if(!isNaN(Number(name))){ //숫자면
				$('#name-alert-danger').show();
				$('#submitBtn').attr("disabled",true);
			}else{
				$('#name-alert-danger').hide();
				$('#submitBtn').attr("disabled",false);
			}
		})

	})
	
</script>
</head>
<body>
	<div align="center">
		<hr width="80%">
		<h2>회원가입</h2>
		<hr width="80%">
		<br>
		<form action="signWelcome.jsp" method="post" name="frm">
			<table width="80%" border="1">
				<tr>
					<th width="20%">이름</th>
					<td><input type="text" size="70" name="name" id="name" required>
               		<div class="name-alert" id="name-alert-danger" style="color:red">텍스트만 입력하세요</div> 
				</tr>
				<tr>
					<th width="20%">ID</th>
					<td><input type="text" size="60" name="id" id="id" required>
					<button id="중복체크">중복체크</button></td>
				</tr>
				<tr>
					<th width="20%">비밀번호</th>
					<td><input type="password" size="70" name="password" id="password" required></td>
					
				</tr>
				<tr>
					<th width="20%">비밀번호확인</th>
					<td><input type="password" size="50" name="passwordck" id="passwordck" required>
               		<div class="alert alert-danger" id="alert-danger" style="color:red">비밀번호가 일치하지 않습니다.</div> 
				</tr>
				<tr>
					<th width="20%">이메일</th>
					<td><input type="text" size="15" name="eid" id="eid" required> @ 
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
					</select> - <input type="text" name="tel2" id="tel2" size="4" maxlength="4" placeholder="XXXX" required> - 
					<input type="text" name="tel3" id="tel3" size="4" maxlength="4" placeholder="XXXX" required>
					</td>
				</tr>
				<tr>
					<th width="20%">주소</th>
					<td>
					
					우편번호 : <input type="text" name="zip" id="zip" size="25" readonly required/>
					<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기" required><br>
					도로명주소 : <input type="text" name="addr1" id="addr1" size="50" readonly required/><br>
					상세 : <input type="text" name="addr2" id="addr2" size="50" />
					</td>
				</tr>
			</table>
			<br>
			<input type="reset" value="취소">
			<input type="submit" value="가입하기" id="submitBtn">
		</form>
	</div>

</body>
</html>