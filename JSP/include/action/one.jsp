<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp전체구조가 있을 필요없다. -->
<%
	request.setAttribute("phone", "1234-0000");
%>
<hr>
request 공유영역 id : ${ id }<br>
<h4>파라미터 정보</h4>
name : ${ param.name }<br>
age : ${ param.age }<br>
<h3>인클루드된 내용</h3>
<h3>인클루드된 내용</h3>
<h3>인클루드된 내용</h3>
<h3>인클루드된 내용</h3>
<h3>인클루드된 내용</h3>
<hr>