<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 객체찾기</title>
</head>
<body>
	<%-- 
		http://localhost:9999/Lecture-web/jsp/EL/exam02.jsp?id=aaa&name=bbb&hobby=music&hobby=movie 요청시 id의 값 추출
	 --%>
	 
	 <%
	 	String id= request.getParameter("id");
	 %>
	 id : <%= id %><br>
	 id : <%= request.getParameter("id") %><br>
	 name : <%= request.getParameter("name") %><br>
	 <% String[] hb = request.getParameterValues("hobby"); 
		 if(hb == null){
				hb = new String[]{"파라미터 없음!"};
		 	}
	 %>
	 <%--
	 	hobby값이 안붙어있으면 아래에서 에러가남.
	  --%>
	 hobby : <%= hb[0] %><br>
	 
	 el-id : ${ param.id }<br>
	 el-name : ${ param.name }<br>
	 el-hobby : ${ paramValues.hobby[0] }, ${ paramValues.hobby[1] }
	 
</body>
</html>