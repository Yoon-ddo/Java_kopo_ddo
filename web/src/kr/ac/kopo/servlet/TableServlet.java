package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:9999/Lecture-web/serlvet/table?row=4&col=3요청시


//http://localhost:9999/Lecture-web/serlvet/table요청시
//5x5테이블 생성
//http://localhost:9999/Lecture-web/serlvet/table요청시
//2x5테이블 생성

// @WebServlet("/servlet/tableExam")
public class TableServlet extends HttpServlet{

	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String row = request.getParameter("row");
		String col = request.getParameter("col");
		System.out.println(row+","+col);
		
		response.setContentType("text/html; charset=utf-8;");
		//텍스트중에 html문서를 넘길래, charset은 utf-8
		PrintWriter out = response.getWriter();
		int r = Integer.parseInt(row);
		int c = Integer.parseInt(col);
		
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 호출 방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		
		out.println("		<table border=\"1\">");
		for(int i = 0; i<r; i++) {
			out.println("<tr>");
			for(int k=0; k<c; k++) {
				out.println("<td>");
				out.println("cell("+i+","+k+")");
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("		</table>");
		
		out.println("	</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
		

	}
	
}
