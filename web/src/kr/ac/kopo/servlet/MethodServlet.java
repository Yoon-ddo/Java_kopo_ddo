package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		//System.out.println("init() ... 최초 한번만 실행되는 메소드");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// 서버에 요청 : Response
		StringBuffer url = request.getRequestURL();// 속도때문에 StringBuffer사용
		System.out.println("url : "+url.toString());
		// url : http://localhost:9999/Lecture-web/method
		
		//request.getRequestURI()는 /Lecture-web/method만 받아온다.
		
		String uri = request.getRequestURI();
		System.out.println("uri : "+uri.toString());
		
		//method가 무슨방식인지 알고싶을때
		String meth = request.getMethod();
		System.out.println("method : "+meth.toString());
		
		//input text태그에 입력한 값 받아오기
		String id = request.getParameter("id");
		System.out.println("id : "+ id);
		
		
		/* client에 응답 : response
		 * outputstream / writer필요
		 */
		response.setContentType("text/html; charset=utf-8;");
		//텍스트중에 html문서를 넘길래, charset은 utf-8
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 호출 방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("=============================================<br>");
		out.println("<h1>요청결과</h1>");
		out.println("=============================================<br>");
		out.println("ID : " + id + "<br>");
		out.println("요청방식 : " + meth + "<br>");
		out.println("URL : " + url + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("=============================================<br>");
		out.println("	</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
		
		
		
	}

}
