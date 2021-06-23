<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글등록</title>
<script type="text/javascript" src="/Mission-Web/resources/js/jquery-3.6.0.min.js"></script>
<script>
	
	

	
	$(document).ready(function() {
		$('#goListBtn').click(function() {
			location.href = "list.jsp"
		})

	})
	
	
	
	function whenSubmit(){
		
		let params = [$('#title').val(), $('#writer').val(), $('#content').val()]
		let result = 0
		for (let i=0; i<params.length; i++){
			if(params[i] != ''){
				result += 1
			}
		}
		if(result == 3 ){
			return true
		}else{
			alert("모든 값을 입력해주세요!")
			return false
		}
	}
	
	function doWrite(){
		let f = document.writeForm
		if(f.title.value == ''){
			alert('제목을 입력하세요')
			f.title.focus()
			return false
		}
		if(f.writer.value==''){
			alert('작성자를 입력하세요')
			f.writer.focus()
			return false
		}
		if(f.content.value == ''){
			alert('내용을 입력하세요')
			f.content.focus()
			return false
		}
		
		return true
		
		
	}
	
</script>
</head>
<body>
	<div align="center">
		<hr width="80%">
		<h2>게시글 등록폼</h2>
		<hr width="80%">
		<br>
		<form action="write.jsp" method="post" name="writeForm" onsubmit="return doWrite()">
			<table border="1" style="width: 80%">
				<tr>
					<th width="25%">제목</th>
					<td>
						<input type="text" size="60" name="title" id="title" >
					</td>
				</tr>
				<tr>
					<th width="25%">작성자</th>
					<td>
						<input type="text" size="60" name="writer" id="writer">
					</td>
				</tr>
				<tr>
					<th width="25%">내용</th>
					<td>
						<textarea rows="8" cols="60" name="content" id="content"></textarea>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="등록" id="submitBtn">
			<input type="button" value="목록" id="goListBtn">
		</form>
	</div>
</body>
</html>













